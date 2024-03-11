package com.sjb.api.member;

import com.sjb.api.common.BaseException;
import com.sjb.api.member.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import java.util.Optional;

import static com.sjb.api.common.BaseResponseStatus.POST_USERS_EXISTS_EMAIL;

@Service
@RequiredArgsConstructor
public class MemberDetailServiceImpl implements UserDetailsService {
    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String membername) throws UsernameNotFoundException {
        Member member = memberRepository.findByEmail(membername).orElseThrow(() ->
                new UsernameNotFoundException("사용자가 존재하지 않습니다."));

        return member;
    }
}