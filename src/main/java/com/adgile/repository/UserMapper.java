package com.adgile.repository;

import com.adgile.domain.User;
import com.adgile.dto.request.UserRequestDto;
import com.adgile.dto.response.UserInfoResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {

    List<UserInfoResponse> getList(HashMap<String, Object> where);

    Optional<User> getData(HashMap<String, Object> where);

    int create(UserRequestDto.create request);

    int update(@Param("request") UserRequestDto.update request, @Param("id") Long id);

    int delete(Long id);
}
