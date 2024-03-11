package com.sjb.api.config;

import com.sjb.api.config.filter.JwtFilter;
import com.sjb.api.utils.JwtTokenUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig {
    private final JwtTokenUtils jwtTokenUtils;

    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {

        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) {
        try {

            http.csrf().disable()
                    .authorizeRequests()
                    .antMatchers("/member/test").hasRole("USER")
                    .antMatchers("/member/test/teacher").hasRole("TEACHER")
                    .antMatchers("/**").permitAll()
                    .anyRequest().authenticated()
                    .and()
                    .formLogin().disable();
            http.addFilterBefore(new JwtFilter(jwtTokenUtils), UsernamePasswordAuthenticationFilter.class);

            return http.build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
