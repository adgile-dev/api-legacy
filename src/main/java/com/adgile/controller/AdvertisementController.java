package com.adgile.controller;

import com.adgile.Response;
import com.adgile.dto.request.AdvertisementRequestDto;
import com.adgile.dto.response.AdvertisementInfoResponse;
import com.adgile.service.AdvertisementService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

@Setter
@RestController
@RequestMapping("v1/advertisement")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class AdvertisementController {

    private final AdvertisementService advertisementService;

    @GetMapping("")
    public Response<String> getList() {
        return Response.OK;
    }

    @GetMapping("{id}")
    public Response<AdvertisementInfoResponse> getData(@PathVariable Long id) {
        var test = advertisementService.getDataOfBudget(id);
        return Response.success(test);
    }

    // 생성
    @PostMapping("")
    public Response<String> create(@RequestBody AdvertisementRequestDto.create request) {
        advertisementService.create(request);
        return Response.OK;
    }

    // 삭제
    @DeleteMapping("{id}")
    public Response<String> delete(@PathVariable Long id) {
        advertisementService.delete(id);
        return Response.OK;
    }
}
