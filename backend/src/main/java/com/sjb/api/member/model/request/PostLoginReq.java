package com.sjb.api.member.model.request;

import lombok.*;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostLoginReq {
    private String email;

    private String password;
}
