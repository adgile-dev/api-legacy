package com.adgile.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

public class BudgetRequestDto {

    @Data
    public static class create {

        @NotNull
        private Long advertisementId;
        @NotNull
        private Integer total;
        @NotNull
        private Boolean isTotalLimit;
        @NotNull
        private Integer daily;

        @NotNull
        private Boolean isDailyLimit;
        @NotNull
        private Integer priceType;

        @NotNull
        private Integer executionPrice;

        @NotNull
        private Integer executionPricePerDollar;

        @NotNull
        private Integer dailyCap;

        @NotNull
        private Boolean isDailyCapLimit;
        @NotNull
        private Integer totalDailyCap;
        @NotNull
        private Boolean isTotalDailyCapLimit;
    }
}
