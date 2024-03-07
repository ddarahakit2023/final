package com.sjb.api.common;

import lombok.Getter;

/**
 * 에러 코드 관리
 */
@Getter
public enum BaseResponseStatus {
    /**
     * 1000 : 요청 성공
     */
    SUCCESS(true, 1000, "요청에 성공하였습니다."),

    /**
     * 2000 : COURSE 에러
     */
    POST_COURSE_EMPTY_NAME(false, 2001, "코스의 이름을 입력해주세요."),
    POST_COURSE_EMPTY_PRICE(false, 2002, "코스의 가격을 입력해주세요."),
    POST_COURSE_EMPTY_DESCRIPTION(false, 2003, "코스의 설명을 입력해주세요."),

    POST_COURSE_PRE_EXIST_NAME(false, 2004, "이미 존재하는 코스 이름입니다. 다른 이름을 입력해주세요."),
    COURSE_LIST_NULL(false,2005,"등록된 코스가 존재하지 않습니다.");

    private final boolean isSuccess;
    private final int code;
    private final String message;

    private BaseResponseStatus(boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}
