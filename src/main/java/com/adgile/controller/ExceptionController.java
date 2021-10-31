package com.adgile.controller;

import com.adgile.error.BusinessException;
import com.adgile.error.ErrorCode;
import com.adgile.error.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


@RestControllerAdvice
public class ExceptionController {

    private static final Logger logger = LogManager.getLogger(ExceptionController.class);

    // 비즈니스 로직 관련 예외처리 클래스

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorResponse> handleBusinessException(BusinessException e) {
        final ErrorCode errorCode = e.getErrorCode();
        final ErrorResponse errorResponse = ErrorResponse.of(errorCode);

        logger.error("BusinessException 발생");

        // TODO: error Response code & message 변경 해야함

        return new ResponseEntity<>(errorResponse, HttpStatus.OK);
    }
}
