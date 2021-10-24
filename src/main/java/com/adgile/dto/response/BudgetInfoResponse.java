package com.adgile.dto.response;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BudgetInfoResponse {

    private Integer total;
    private Boolean isTotalLimit;
    private Integer daily;

    private Boolean isDailyLimit;
    private Integer priceType;

    private Integer executionPrice;
    private Integer executionPricePerDollar;

    private Integer dailyCap;

    private Boolean isDailyCapLimit;

    private Integer totalDailyCap;
    private Boolean isTotalDailyCapLimit;

    @Builder
    public BudgetInfoResponse(Integer total, Boolean isTotalLimit, Integer daily,
                              Boolean isDailyLimit, Integer priceType, Integer executionPrice,
                              Integer executionPricePerDollar, Integer dailyCap, Boolean isDailyCapLimit,
                              Integer totalDailyCap, Boolean isTotalDailyCapLimit) {
        this.total = total;
        this.isTotalLimit = isTotalLimit;
        this.daily = daily;
        this.isDailyLimit = isDailyLimit;
        this.priceType = priceType;
        this.executionPrice = executionPrice;
        this.executionPricePerDollar = executionPricePerDollar;
        this.dailyCap = dailyCap;
        this.isDailyCapLimit = isDailyCapLimit;
        this.totalDailyCap = totalDailyCap;
        this.isTotalDailyCapLimit = isTotalDailyCapLimit;
    }
}
