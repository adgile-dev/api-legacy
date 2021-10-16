package com.adgile.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
public class BooleanResponse {
    private boolean result;

    @Builder
    public BooleanResponse(boolean result) {
        this.result = result;
    }

    public static BooleanResponse of (boolean result) {
        return BooleanResponse.builder()
                .result(result)
                .build();
    }
}
