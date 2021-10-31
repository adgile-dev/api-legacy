package com.adgile.service;

import com.adgile.Response;
import com.adgile.dto.request.AdvertisementRequestDto;
import com.adgile.dto.response.AdvertisementInfoResponse;
import com.adgile.error.user.UserNotExistException;
import com.adgile.repository.AdvertisementMapper;
import com.adgile.repository.UserMapper;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdvertisementService {

    private final BudgetService budgetService;
    private final AdvertisementMapper advertisementMapper;
    private final UserMapper userMapper;

    public AdvertisementInfoResponse getDataOfBudget(Long id) {
        return advertisementMapper.getDataOfBudget(id);
    }

    public List<AdvertisementInfoResponse> getList() {
        return advertisementMapper.getList();
    }

    public void create(AdvertisementRequestDto.create request) {

        HashMap<String, Object> where = new HashMap<>();
        where.put("id", request.getUserId());
        userMapper.getData(where)
                .orElseThrow(UserNotExistException::new);

        advertisementMapper.create(request);
        budgetService.create(request);
    }

    public void update(AdvertisementRequestDto.update request) {

        HashMap<String, Object> where = new HashMap<>();
        where.put("id", request.getUserId());
        userMapper.getData(where)
                .orElseThrow(UserNotExistException::new);

        advertisementMapper.update(request);
    }

    public void delete(Long id) {
        advertisementMapper.delete(id);
        budgetService.delete(id);
    }
}
