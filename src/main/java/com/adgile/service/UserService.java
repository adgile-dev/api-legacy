package com.adgile.service;

import com.adgile.domain.User;
import com.adgile.dto.request.UserRequestDto;

import com.adgile.dto.response.UserInfoResponse;
import com.adgile.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserMapper userMapper;

    public List<UserInfoResponse> getList() {
        return userMapper.getList();
    }

    public UserInfoResponse getData(Long id) {
        User user =  userMapper.getData(id);
        return UserInfoResponse.of(user);
    }

    public void create(UserRequestDto.create request) {
        userMapper.create(request);
    }

    public void update(UserRequestDto.update request, Long id) {

        System.out.println("------- service update");
        System.out.println(request);
        System.out.println("------- // service update");
        System.out.println("------- // service id :: " + id);
        userMapper.update(request, id);
    }

    public void delete(Long id) {
        userMapper.delete(id);
    }
}
