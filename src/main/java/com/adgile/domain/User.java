package com.adgile.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Long id;
    private Integer type;
    private Integer userType;
    private String userId;
    private String name;
    private String manager;
    private String email;
    private Integer currencyType;
    private String invoiceEmail;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
