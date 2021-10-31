package com.adgile.controller;

import com.adgile.Response;
import com.adgile.dto.request.AdvertisementRequestDto;
import com.adgile.dto.request.BudgetRequestDto;
import com.adgile.dto.response.AdvertisementInfoResponse;
import com.adgile.service.AdvertisementService;
import com.adgile.service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("v1/advertisement")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class AdvertisementController {

    private final AdvertisementService advertisementService;
    private final BudgetService budgetService;

    @GetMapping("")
    public Response<List<AdvertisementInfoResponse>> getList() {
        return Response.success(advertisementService.getList());
    }

    @GetMapping("{id}")
    public Response<AdvertisementInfoResponse> getData(@PathVariable Long id) {
        return Response.success(advertisementService.getDataOfBudget(id));
    }

    // 생성
    @PostMapping("")
    public Response<String> create(@RequestBody AdvertisementRequestDto.create request) {
        advertisementService.create(request);
        return Response.OK;
    }

    @PutMapping("{id}")
    public Response<String> update(@RequestBody @Valid AdvertisementRequestDto.update request) {
        advertisementService.update(request);
        return Response.OK;
    }


    // 삭제
    @DeleteMapping("{id}")
    public Response<String> delete(@PathVariable Long id) {
        advertisementService.delete(id);
        return Response.OK;
    }
}
