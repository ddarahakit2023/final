package com.sjb.api.member;

import com.sjb.api.common.BaseException;
import com.sjb.api.member.model.Member;
import com.sjb.api.member.model.request.PostLoginReq;
import com.sjb.api.member.model.request.PostSignupReq;
import com.sjb.api.member.model.response.PostLoginRes;
import com.sjb.api.member.model.response.PostSignupRes;
import com.sjb.api.utils.JwtTokenUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import static com.sjb.api.common.BaseResponseStatus.POST_USERS_EXISTS_EMAIL;
import static com.sjb.api.common.BaseResponseStatus.POST_USERS_INVALID_USER_INFO;


@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtTokenUtils jwtTokenUtils;
    public PostSignupRes signup(PostSignupReq request) throws BaseException {
        if(memberRepository.existsByEmail(request.getEmail())) {
            throw new BaseException(POST_USERS_EXISTS_EMAIL);
        }
        Member member = Member.builder()
                .email(request.getEmail())
                .name(request.getName())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();

        member = memberRepository.save(member);

        return PostSignupRes.builder()
                .id(member.getId())
                .email(member.getEmail())
                .name(member.getName())
                .build();

    }

    public PostLoginRes login(PostLoginReq request) throws BaseException {
        try {
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
            Member member = (Member) authentication.getPrincipal();
            String accessToken = jwtTokenUtils.generateAccessToken(member);
            return PostLoginRes.builder().accessToken(accessToken).build();
        } catch (Exception e) {
               throw new BaseException(POST_USERS_INVALID_USER_INFO);
        }
    }
}
