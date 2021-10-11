package com.adgile.service;

import com.adgile.dto.request.UserRequestDto;

import com.adgile.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserMapper userMapper;

    public HashMap<String, Object> getData(Long id) {
        return userMapper.getData(id);
    }

    public void create(UserRequestDto.create request) {
        System.out.println("--------- service >> ");
        userMapper.create(request);
    }

    public void update() {

    }

    public void delete() {

    }
}
