package com.adgile.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Budget {
    private Long id;
    private Long advertisementId;
    private Integer total;
    private Boolean isTotalLimit;
    private Integer daily;
    private Boolean isDailyLimit;
    private Integer priceType;
    private Integer executionPrice;
    private Integer executionPricePerDollar;
    private Long dailyCap;
    private Boolean isDailyCapLimit;
    private Long totalDailyCap;
    private Boolean isTotalDailyCapLimit;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

}
