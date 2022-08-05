package com.example.testsetting.common.exceptions;

import lombok.Getter;

public enum ErrorCode {

    /** internal Spring MVC exceptions */
    INTERNAL_SERVER_ERROR("E5000")
    /** 값 없음 */
    , DATA_NOT_FOUND("E1010")

    ;

    @Getter
    private final String code;

    private ErrorCode(String code) {
        this.code = code;
    }

}
