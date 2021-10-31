package com.adgile.error.user;

import com.adgile.error.ErrorCode;
import com.adgile.error.BusinessException;

public class UserNotExistException extends BusinessException {
    public UserNotExistException() {
        super(ErrorCode.USER_NOT_EXIST);
    }
}
