package com.adgile.controller;

import com.adgile.Response;
import com.adgile.dto.request.AdvertisementRequestDto;
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
    public Response<String> getData(@PathVariable Long id) {
        return Response.OK;
    }

    // 생성
    @PostMapping("")
    public Response<String> create(@RequestBody AdvertisementRequestDto.create request) {

        return Response.OK;
    }

    // 수정
    @PutMapping("{id}")
    public Response<String> update(@PathVariable Long id, @RequestBody AdvertisementRequestDto.update request) {
        return Response.OK;
    }

    // 삭제
    @DeleteMapping("{id}")
    public Response<String> delete(@PathVariable Long id) {
        return Response.OK;
    }
}
