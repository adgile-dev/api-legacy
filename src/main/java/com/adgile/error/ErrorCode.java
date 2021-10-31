package com.adgile.error;

public enum ErrorCode {

    // 공통

    USER_NOT_EXIST(500, "존재하지 않는 회원입니다");

    private final Integer code;
    private final String message;

    ErrorCode(final Integer code, final String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

}

