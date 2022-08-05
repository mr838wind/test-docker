package com.example.testsetting.common.exceptions;

import lombok.Getter;

/**
 * 사용자 정의 exception
 */
public class ApiException extends RuntimeException {

    @Getter
    private ErrorCode errorCode;

    public ApiException(ErrorCode errorCode){
        this(errorCode, "");
    }

    public ApiException(ErrorCode errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }


}
