package com.adgile.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Media {
    private Long id;
    private Long userId;
    private String name;
    private String manager;
    private String email;
    private String clickUrl;
    private String installPostback;
    private String eventPostback;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;
}
