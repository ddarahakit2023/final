package com.sjb.api.member;

import com.sjb.api.common.BaseException;
import com.sjb.api.member.model.Member;
import com.sjb.api.member.model.request.PostLoginReq;
import com.sjb.api.member.model.request.PostSignupReq;
import com.sjb.api.member.model.response.PostLoginRes;
import com.sjb.api.member.model.response.PostSignupRes;
import com.sjb.api.utils.JwtTokenUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import static com.sjb.api.common.BaseResponseStatus.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class MemberServiceTest {
    @Mock
    private MemberRepository memberRepository;
    @Mock
    private PasswordEncoder passwordEncoder;
    @Mock
    private AuthenticationManager authenticationManager;
    @Mock
    private JwtTokenUtils jwtTokenUtils;
    @InjectMocks
    private MemberService memberService;

    private static Member member;
    private static PostSignupReq signupRequest;
    private static PostLoginReq loginRequest;
    @BeforeAll
    static void setUp() {
        signupRequest = PostSignupReq.builder()
                .email("test01@test.com")
                .name("테스트01")
                .password("qwer1234")
                .build();

        loginRequest =PostLoginReq.builder()
                .email("test01@test.com")
                .password("qwer1234")
                .build();

        member = Member.builder()
                .id(1L)
                .email(signupRequest.getEmail())
                .name(signupRequest.getName())
                .password("{bcrypt}$2a$10$eL4RY/wzQbwvLTQkyBS1mu0ArEdBcOuJxfy6ztqs30FZeUPhGMIKa")
                .authority("ROLE_MEMBER")
                .build();


    }

    @Test
    void memberService_signup_success() {
        // given
        given(memberRepository.save(any(Member.class))).willReturn(member);

        // when
        PostSignupRes response;
        try {
            response = memberService.signup(signupRequest);
        } catch (BaseException e) {
            throw new RuntimeException(e);
        }

        // then
        assertNotNull(response.getId());
        assertEquals(signupRequest.getName(),  response.getName());
    }

    @Test
    void memberService_signup_fail_pre_exist_email() {
        // given
        given(memberRepository.existsByEmail(signupRequest.getEmail())).willReturn(true);

        // when
        BaseException exception = assertThrows(BaseException.class, () -> {
            memberService.signup(signupRequest);
        });

        // then
        assertEquals(POST_USERS_EXISTS_EMAIL, exception.getStatus());
    }


    @Test
    void memberService_login_success() {
        // given
        Authentication authentication = mock(Authentication.class);
        given(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class))).willReturn(authentication);
        given((Member) authentication.getPrincipal()).willReturn(member);
        given(jwtTokenUtils.generateAccessToken(member)).willReturn("eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwibmFtZSI6Iu2FjOyKpO2KuDAxIiwicm9sZXMiOiJST0xFX1VTRVIiLCJpYXQiOjE3MTAxMjA1MzEsImV4cCI6MTcxMDEzODUzMX0.hP1UwgfXWfju9mzPOLL-BzXa-b-u4GfOLr7mIzqwF4c");

        // when
        PostLoginRes response;
        try {
            response = memberService.login(loginRequest);
        } catch (BaseException e) {
            throw new RuntimeException(e);
        }

        // then
        assertNotNull(response.getAccessToken());

    }

    @Test
    void memberService_login_fail() {
        // given
        given(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class))).willThrow(new UsernameNotFoundException("사용자가 존재하지 않습니다."));

        // when
        BaseException exception = assertThrows(BaseException.class, () -> {
            memberService.login(loginRequest);
        });

        // then
        assertEquals(POST_USERS_INVALID_USER_INFO, exception.getStatus());

    }

}