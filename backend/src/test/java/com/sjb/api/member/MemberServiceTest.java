package com.sjb.api.member;

import com.sjb.api.common.BaseException;
import com.sjb.api.learning.course.model.Course;
import com.sjb.api.learning.course.model.request.PostCourseReq;
import com.sjb.api.learning.course.model.response.GetCourseRes;
import com.sjb.api.learning.course.model.response.PostCourseRes;
import com.sjb.api.member.model.Member;
import com.sjb.api.member.model.request.PostSignupReq;
import com.sjb.api.member.model.response.PostSignupRes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.sjb.api.common.BaseResponseStatus.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class MemberServiceTest {
    @Mock
    private MemberRepository memberRepository;
    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private MemberService memberService;

    private static Member member;
    private static PostSignupReq request;
    @BeforeAll
    static void setUp() {
        request = PostSignupReq.builder()
                .email("test01@test.com")
                .name("테스트01")
                .password("qwer1234")
                .build();
        member = Member.builder()
                .id(1L)
                .email(request.getEmail())
                .name(request.getName())
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
            response = memberService.signup(request);
        } catch (BaseException e) {
            throw new RuntimeException(e);
        }

        // then
        assertNotNull(response.getId());
        assertEquals(request.getName(),  response.getName());
    }

    @Test
    void memberService_signup_fail_pre_exist_email() {
        // given
        given(memberRepository.existsByEmail(request.getEmail())).willReturn(true);

        // when
        BaseException exception = assertThrows(BaseException.class, () -> {
            memberService.signup(request);
        });

        // then
        assertEquals(POST_USERS_EXISTS_EMAIL, exception.getStatus());
    }

}