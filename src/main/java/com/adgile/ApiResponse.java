package com.adgile;

import lombok.*;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiResponse<T> {

    private Integer code;
    private String message;
    private T data;

    public static final ApiResponse<String> OK = new ApiResponse<>(200, "OK", null);

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(200, null, data);
    }

    public static ApiResponse<Object> error(Integer code, String message) {
        return new ApiResponse<>(code, message, null);
    }

}
