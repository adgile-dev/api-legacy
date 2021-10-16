package com.adgile.controller;

import com.adgile.ApiResponse;
import com.adgile.dto.request.UserRequestDto;
import com.adgile.dto.response.UserInfoResponse;
import com.adgile.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("")
    public ApiResponse<String> create(@RequestBody UserRequestDto.create request) {
        userService.create(request);
        return ApiResponse.OK;
    }

    @GetMapping("")
    public ApiResponse<List<UserInfoResponse>> getList() {
        var test = userService.getList();
        return ApiResponse.success(test);
    }

    @GetMapping("{id}")
    public ApiResponse<UserInfoResponse> getData(@PathVariable("id") Long id) {
        return ApiResponse.success(userService.getData(id));
    }


}
