package com.sjb.api.member.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostLoginRes {
    private String accessToken;
}