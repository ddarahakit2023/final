package com.sjb.api.member;

import com.sjb.api.common.BaseException;
import com.sjb.api.member.model.Member;
import com.sjb.api.member.model.request.PostSignupReq;
import com.sjb.api.member.model.response.PostSignupRes;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import static com.sjb.api.common.BaseResponseStatus.POST_USERS_EXISTS_EMAIL;


@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

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
}
