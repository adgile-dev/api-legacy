package com.adgile.error.media;

import com.adgile.error.BusinessException;
import com.adgile.error.ErrorCode;

public class MediaNotExistException extends BusinessException {
    public MediaNotExistException() {
        super(ErrorCode.MEDIA_NOT_EXIST);
    }
}
