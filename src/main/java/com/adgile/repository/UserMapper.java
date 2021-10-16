package com.adgile.repository;

import com.adgile.domain.User;
import com.adgile.dto.request.UserRequestDto;
import com.adgile.dto.response.UserInfoResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserInfoResponse> getList();

    User getData(Long id);

    int create(UserRequestDto.create request);

//    int update(UserRequestDto.update request, Long id);
    int update(@Param("request") UserRequestDto.update request, @Param("id") Long id);

    int delete(Long id);
}
