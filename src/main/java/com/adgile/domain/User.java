package com.adgile.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Long id;
    private Integer type;
    private Integer user_type;
    private String user_id;
    private String name;
    private String manager;
    private String email;
    private String currency_type;
    private String invoice_email;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
