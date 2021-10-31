package com.adgile.error;

import lombok.ToString;

public class ErrorResponse {

    private String message;
    private Integer code;

    private ErrorResponse(final ErrorCode code) {
        this.message = code.getMessage();
        this.code = code.getCode();
    }

    public static ErrorResponse of (final ErrorCode code) {
        return new ErrorResponse(code);
    }

    public String getMessage() {
        return message;
    }
    public Integer getCode() {
        return code;
    }
}