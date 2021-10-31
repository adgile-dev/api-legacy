package com.adgile.service;

import com.adgile.dto.request.AdvertisementRequestDto;
import com.adgile.dto.request.BudgetRequestDto;
import com.adgile.error.budget.BudgetNotExistException;
import com.adgile.repository.BudgetMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class BudgetService {

    private final BudgetMapper budgetMapper;

    public void create(AdvertisementRequestDto.create dto) {
        budgetMapper.create(dto);
    }

    public void update(BudgetRequestDto.update request) {

        HashMap<String, Object> where = new HashMap<>();
        where.put("id", request.getId());

        budgetMapper.getData(where).orElseThrow(BudgetNotExistException::new);

        budgetMapper.update(request);
    }

    public void delete(Long id) {
        budgetMapper.delete(id);
    }
}
