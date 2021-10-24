package com.adgile.service;

import com.adgile.Response;
import com.adgile.dto.request.AdvertisementRequestDto;
import com.adgile.dto.response.AdvertisementInfoResponse;
import com.adgile.repository.AdvertisementMapper;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdvertisementService {

    private final BudgetService budgetService;
    private final AdvertisementMapper advertisementMapper;

    public AdvertisementInfoResponse getDataOfBudget(Long id) {
        var test =  advertisementMapper.getDataOfBudget(id);

        System.out.println("------------ response ");
        System.out.println(test);
        System.out.println("------------ // response ");

        return test;
    }

    public void create(AdvertisementRequestDto.create request) {
        advertisementMapper.create(request);
        budgetService.create(request);
    }

    public void delete(Long id) {
        advertisementMapper.delete(id);
        budgetService.delete(id);
    }
}
