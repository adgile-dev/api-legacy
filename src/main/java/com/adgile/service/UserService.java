package com.adgile.service;

import com.adgile.domain.User;
import com.adgile.dto.request.UserRequestDto;

import com.adgile.dto.response.BooleanResponse;
import com.adgile.dto.response.UserInfoResponse;
import com.adgile.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;


@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserMapper userMapper;

    public List<UserInfoResponse> getList() {
        return userMapper.getList();
    }

    public UserInfoResponse getData(Long id) {
        HashMap<String, Object> where = new HashMap<>();
        where.put("id", id);
        User user =  userMapper.getData(where).orElseThrow(
        );
        return UserInfoResponse.of(user);
    }

    public BooleanResponse getCheckById(String userId) {
        HashMap<String, Object> where = new HashMap<>();
        where.put("userId", userId);
        Optional<User> user = userMapper.getData(where);

        return BooleanResponse.of(user.isEmpty());
    }

    public void create(UserRequestDto.create request) {
        userMapper.create(request);
    }

    public void update(UserRequestDto.update request, Long id) {
        userMapper.update(request, id);
    }

    public void delete(Long id) {
        userMapper.delete(id);
    }
}
