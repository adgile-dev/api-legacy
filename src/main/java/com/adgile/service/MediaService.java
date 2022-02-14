package com.adgile.service;

import com.adgile.domain.Media;
import com.adgile.dto.request.MediaRequestDto;
import com.adgile.dto.response.MediaInfoResponse;
import com.adgile.error.media.MediaNotExistException;
import com.adgile.error.user.UserNotExistException;
import com.adgile.repository.MediaMapper;
import com.adgile.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MediaService {

    private final UserMapper userMapper;
    private final MediaMapper mediaMapper;

    public MediaInfoResponse getData(Long id) {
        HashMap<String, Object> where = new HashMap<>();
        where.put("id", id);
        Media media = mediaMapper.getData(where)
                .orElseThrow(MediaNotExistException::new);

        return MediaInfoResponse.of(media);
    }

    public List<MediaInfoResponse> getList() {

        HashMap<String, Object> where = new HashMap<>();
        List<MediaInfoResponse> media = mediaMapper.getList(where);

        return media;
    }

    public void create(MediaRequestDto.create request) {

        HashMap<String, Object> where = new HashMap<>();
        where.put("id", request.getUserId());

        userMapper.getData(where)
                .orElseThrow(UserNotExistException::new);

        mediaMapper.create(request);
    }

    public void update(MediaRequestDto.update request, Long id) {
        HashMap<String, Object> where = new HashMap<>();
        where.put("id", request.getUserId());

        userMapper.getData(where)
                .orElseThrow(UserNotExistException::new);

        request.setId(id);
        where.put("id", request.getId());

        mediaMapper.getData(where)
                        .orElseThrow(MediaNotExistException::new);
        mediaMapper.update(request);
    }

    public void delete(Long id) {
        mediaMapper.delete(id);
    }
}
