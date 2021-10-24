package com.adgile.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.sql.Timestamp;

public class AdvertisementRequestDto {
    @Data
    public static class create {
        // Advertisement 광고 관련

        private Long id;

        @NotNull
        private Long userId;
        @NotNull
        private Integer osType;
        @NotNull
        private Integer type;

        @NotBlank
        private Timestamp startDate;

        @NotBlank
        private Timestamp endDate;
        
        @NotBlank
        private String downloadLink;

        // ㅇㅖ산 관련
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

    @Data
    public static class update {
        // Advertisement 광고 관련
        private Long id;
        @NotNull
        private Long userId;
        @NotNull
        private Integer osType;
        @NotNull
        private Integer type;
        @NotBlank
        private Timestamp end_date;
        @NotBlank
        private Timestamp start_date;
        @NotBlank
        private String download_link;

        // ㅇㅖ산 관련
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
        private Integer dailyCap;

        @NotNull
        private Boolean isDailyCapLimit;
        @NotNull
        private Integer totalDailyCap;
        @NotNull
        private Boolean isTotalDailyCapLimit;
    }
}
