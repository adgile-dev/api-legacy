package com.adgile.controller;

import com.adgile.ApiResponse;
import com.adgile.dto.request.UserRequestDto;
import com.adgile.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{id}")
    public void getData(@PathVariable("id") Long id) {
        var test = userService.getData(id);
        System.out.println("test >> >");
        System.out.println(test);
        System.out.println("// test >> >");
    }
}
