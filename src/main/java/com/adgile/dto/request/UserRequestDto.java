package com.adgile.dto.request;

import lombok.Data;

public class UserRequestDto {
    @Data
    public static class create {
        private Integer type;
        private Integer userType;
        private String userId;
        private String name;
        private String manager;
        private String email;
        private String invoiceEmail;
        private Integer currencyType;
    }
}
