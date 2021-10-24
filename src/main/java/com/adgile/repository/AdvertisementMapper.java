package com.adgile.repository;

import com.adgile.dto.request.AdvertisementRequestDto;
import com.adgile.dto.response.AdvertisementInfoResponse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdvertisementMapper {

    AdvertisementInfoResponse getDataOfBudget(Long id);

    Long create(AdvertisementRequestDto.create request);

    void delete(Long id);
}
