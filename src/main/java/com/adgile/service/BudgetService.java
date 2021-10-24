package com.adgile.service;

import com.adgile.dto.request.AdvertisementRequestDto;
import com.adgile.repository.BudgetMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BudgetService {

    private final BudgetMapper budgetMapper;

    public void create(AdvertisementRequestDto.create dto) {
        budgetMapper.create(dto);
    }

    public void delete(Long id) {
        budgetMapper.delete(id);
    }
}
