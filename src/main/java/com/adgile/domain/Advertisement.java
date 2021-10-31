package com.adgile.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Advertisement {
    private Long id;
    private Long userId;
    private Integer osType;
    private Integer type;
    private Timestamp startDate;
    private Timestamp endDate;
    private String downloadLink;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
