package com.adgile.repository;

import com.adgile.dto.request.AdvertisementRequestDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BudgetMapper {

    void create(AdvertisementRequestDto.create dto);

    void delete(Long id);
}
