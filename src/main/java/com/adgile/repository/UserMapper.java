package com.adgile.repository;

import com.adgile.domain.User;
import com.adgile.dto.request.UserRequestDto;
import com.adgile.dto.response.UserInfoResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserInfoResponse> getList();

    User getData(Long id);

    int create(UserRequestDto.create request);
}
