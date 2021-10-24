package com.adgile.dto.response;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class AdvertisementInfoResponse {

    private Long id;

    private Long userId;

    private Integer osType;
    private Integer type;

    private Timestamp startDate;
    private Timestamp endDate;

    private String downloadLink;

    private BudgetInfoResponse budget;

    @Builder
    public AdvertisementInfoResponse(Long id, Long userId, Integer osType, Integer type,
                                     Timestamp startDate, Timestamp endDate, String downloadLink,
                                     BudgetInfoResponse budget) {

        this.id = id;
        this.userId = userId;
        this.osType = osType;
        this.type = type;

        this.startDate = startDate;
        this.endDate = endDate;
        this.downloadLink = downloadLink;
        this.budget = budget;
    }

}


