package com.sjb.api.member.model.request;

import lombok.*;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostSignupReq {

    private String email;

    private String password;

    private String name;
}
