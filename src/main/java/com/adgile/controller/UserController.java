package com.adgile.controller;

import com.adgile.Response;
import com.adgile.dto.request.UserRequestDto;
import com.adgile.dto.response.BooleanResponse;
import com.adgile.dto.response.UserInfoResponse;
import com.adgile.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("v1/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping("")
    public Response<List<UserInfoResponse>> getList(UserRequestDto.list request) {
        HashMap<String, Object> where = new HashMap<>();

        where.put("userId", request.getUserId());
        where.put("userType", request.getUserType());

        return Response.success(userService.getList(where));
    }

    @GetMapping("{id}")
    public Response<UserInfoResponse> getData(@PathVariable("id") Long id) {
        return Response.success(userService.getData(id));
    }

    @GetMapping("check/{userId}")
    public Response<BooleanResponse> getCheckById(@PathVariable("userId") String userId) {
        return Response.success(userService.getCheckById(userId));
    }

    // 생성
    @PostMapping("")
    public Response<String> create(@RequestBody UserRequestDto.create request) {
        userService.create(request);
        return Response.OK;
    }

    // 수정
    @PutMapping("{id}")
    public Response<String> update(@PathVariable Long id, @RequestBody UserRequestDto.update request) {
        userService.update(request, id);
        return Response.OK;
    }

    // 삭제
    @DeleteMapping("{id}")
    public Response<String> delete(@PathVariable Long id) {
        userService.delete(id);
        return Response.OK;
    }
}
