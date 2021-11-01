package com.adgile.controller;

import com.adgile.Response;
import com.adgile.dto.request.MediaRequestDto;
import com.adgile.dto.response.MediaInfoResponse;
import com.adgile.service.MediaService;
import io.swagger.annotations.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("v1/media")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class MediaController {

    private final MediaService mediaService;


    @GetMapping("{id}")
    public Response<MediaInfoResponse> getData(@PathVariable Long id) {
        return Response.success(mediaService.getData(id));
    }

    @GetMapping()
    public Response<List<MediaInfoResponse>> getList() {
        return Response.success(mediaService.getList());
    }

    @PostMapping("")
    public Response<String> create(@RequestBody MediaRequestDto.create request) {
        mediaService.create(request);
        return Response.OK;
    }

    @PutMapping("{id}")
    public Response<String> update(@PathVariable Long id, @RequestBody MediaRequestDto.update request) {
        mediaService.update(request, id);
        return Response.OK;
    }

    @DeleteMapping("{id}")
    public Response<String> delete(@PathVariable Long id) {
        mediaService.delete(id);
        return Response.OK;
    }
}
