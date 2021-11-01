package com.adgile.repository;

import com.adgile.domain.Media;
import com.adgile.dto.request.MediaRequestDto;
import com.adgile.dto.response.MediaInfoResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Mapper
public interface MediaMapper {

    List<MediaInfoResponse> getList(HashMap<String, Object> where);

    Optional<Media> getData(HashMap<String, Object> param);

    void create(MediaRequestDto.create request);
    void update(MediaRequestDto.update request);
    void delete(Long id);
}
