package com.sjb.api.member;

import com.sjb.api.config.SecurityConfig;
import com.sjb.api.utils.JwtTokenUtils;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(MemberController.class)
@ContextConfiguration(classes = {SecurityConfig.class, MemberController.class})
class MemberControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    private JwtTokenUtils jwtTokenUtils;
    @MockBean
    private MemberService memberService;

    @Test

    void testMember() throws Exception {

//        given(jwtTokenUtils.signup(any(PostMemberSignupReq.class))).willReturn(new PostMemberSignupRes(true, 1000L, "요청 성공.", result, true));
        given(jwtTokenUtils.getRoles(any(String.class))).willReturn("ROLE_USER");


        mvc.perform(get("/member/test")
                        .header(HttpHeaders.AUTHORIZATION, "Bearer eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwibmFtZSI6Iu2FjOyKpO2KuDAxIiwiZW1haWwiOiJ0ZXN0MDFAdGVzdC5jb20iLCJyb2xlcyI6IlJPTEVfVVNFUiIsImlhdCI6MTcxMDkyMTE1MywiZXhwIjoxNzEwOTM5MTUzfQ.AoWmbgXJrlnj0jEtY8uILKj6P1nzcqbym8REEiHctmw")
                ).andExpect(status().isOk());
    }
}