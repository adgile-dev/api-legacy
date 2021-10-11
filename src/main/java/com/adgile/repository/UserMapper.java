package com.adgile.repository;

import com.adgile.dto.request.UserRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface UserMapper {

    HashMap<String, Object> getData(Long id);

    int create(UserRequestDto.create request);
}
