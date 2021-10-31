package com.adgile.repository;

import com.adgile.dto.request.AdvertisementRequestDto;
import com.adgile.dto.response.AdvertisementInfoResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdvertisementMapper {

    AdvertisementInfoResponse getDataOfBudget(Long id);
    List<AdvertisementInfoResponse> getList();

    Long create(AdvertisementRequestDto.create request);

    void update(AdvertisementRequestDto.update request);

    void delete(Long id);
}
