package com.sjb.api.member;

import com.sjb.api.common.BaseException;
import com.sjb.api.common.BaseResponse;
import com.sjb.api.member.model.Member;
import com.sjb.api.member.model.request.PostLoginReq;
import com.sjb.api.member.model.request.PostSignupReq;
import com.sjb.api.member.model.response.PostLoginRes;
import com.sjb.api.member.model.response.PostSignupRes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.sjb.api.common.BaseResponseStatus.*;

@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping(value = "/member")
public class MemberController {

    private final MemberService memberService;


    @RequestMapping(method = RequestMethod.POST, value = "/signup")
    public BaseResponse<PostSignupRes> signup(@Valid @RequestBody PostSignupReq request) {
        if(request.getEmail() == null){
            return new BaseResponse<>(POST_USERS_EMPTY_EMAIL);
        }
        if(request.getName() == null){
            return new BaseResponse<>(POST_USERS_EMPTY_NAME);
        }
        if(request.getPassword() == null){
            return new BaseResponse<>(POST_USERS_EMPTY_PASSWORD);
        }

        try {
            PostSignupRes response = memberService.signup(request);
            return new BaseResponse<>(response);
        } catch(BaseException exception) {
            return new BaseResponse<>((exception.getStatus()));
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public BaseResponse<PostLoginRes> login(@Valid @RequestBody PostLoginReq request) {
        if(request.getEmail() == null){
            return new BaseResponse<>(POST_USERS_EMPTY_EMAIL);
        }

        if(request.getPassword() == null){
            return new BaseResponse<>(POST_USERS_EMPTY_PASSWORD);
        }

        try {
            PostLoginRes response = memberService.login(request);
            return new BaseResponse<>(response);
        } catch(BaseException exception) {
            return new BaseResponse<>((exception.getStatus()));
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public ResponseEntity testMember(@AuthenticationPrincipal Member member) {

        return ResponseEntity.ok().body(member.getName() + " 사용자 성공");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test/teacher")
    public ResponseEntity testTeacher(@AuthenticationPrincipal Member member) {

        return ResponseEntity.ok().body(member.getName() + " 선생님 사용자 성공");
    }
}