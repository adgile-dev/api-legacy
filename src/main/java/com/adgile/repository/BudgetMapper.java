package com.adgile.repository;

import com.adgile.domain.Budget;
import com.adgile.dto.request.AdvertisementRequestDto;
import com.adgile.dto.request.BudgetRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.Optional;

@Mapper
public interface BudgetMapper {

    Optional<Budget> getData(HashMap<String, Object> params) ;

    void create(AdvertisementRequestDto.create dto);

    void update(BudgetRequestDto.update dto);

    void delete(Long id);
}
