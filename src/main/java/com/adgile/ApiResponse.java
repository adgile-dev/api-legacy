package com.adgile;

import lombok.*;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiResponse<T> {

    private T data;
    private String result;

    public static final ApiResponse<String> OK = new ApiResponse<>("", "00000");

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(data, "00000");
    }

    public static ApiResponse<Object> error(String result) {
        return new ApiResponse<>("", result);
    }

}
