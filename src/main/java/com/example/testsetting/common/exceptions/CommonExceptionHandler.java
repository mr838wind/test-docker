package com.example.testsetting.common.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@RestControllerAdvice
public class CommonExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * 사용자 정의 exception
     * @param e
     * @return
     */
    @ExceptionHandler(value = { ApiException.class } )
    protected ResponseEntity<Object> handleApiException(ApiException e) {
        log.error("handleApiException", e);
        ErrorBody body = ErrorBody.builder()
                .errorCode(e.getErrorCode().getCode())
                .errorMessage(e.getMessage())
                .build();

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(body)
                ;
    }

    /**
     * 기타 서버 에러 (RuntimeException)
     * @param e
     * @return
     */
    @ExceptionHandler(value = { RuntimeException.class } )
    protected ResponseEntity<Object> handleRuntimeException(RuntimeException e) {
        log.error("handleRuntimeException", e);
        ErrorBody body = ErrorBody.builder()
                .errorCode(ErrorCode.INTERNAL_SERVER_ERROR.getCode())
                .errorMessage(e.getMessage())
                .build();

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(body)
                ;
    }

    /**
     * internal Spring MVC exceptions
     * @param e
     * @param body
     * @param headers
     * @param status
     * @param request
     * @return
     */
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception e,
                                                             Object body,
                                                             HttpHeaders headers,
                                                             HttpStatus status,
                                                             WebRequest request) {

        log.error("handleExceptionInternal", e);
        ErrorBody errorBody = ErrorBody.builder()
                .errorCode(ErrorCode.INTERNAL_SERVER_ERROR.getCode())
                .errorMessage(e.getMessage())
                .build();

        return super.handleExceptionInternal(e, errorBody, headers, status, request);
    }



}

