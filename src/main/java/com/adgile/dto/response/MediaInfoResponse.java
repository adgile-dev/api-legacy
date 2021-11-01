package com.adgile.dto.response;

import com.adgile.domain.Media;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class MediaInfoResponse {

    private Long id;
    private Long userId;
    private String name;
    private String manager;
    private String email;

    private String clickUrl;
    private String installPostback;
    private String eventPostback;
    private Timestamp createdAt;

    @Builder
    public MediaInfoResponse(Long id, Long userId, String name, String manager, String email,
                             String clickUrl, String installPostback, String eventPostback, Timestamp createdAt) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.manager = manager;
        this.email = email;
        this.clickUrl = clickUrl;
        this.installPostback = installPostback;
        this.eventPostback = eventPostback;
        this.createdAt = createdAt;
    }

    public static MediaInfoResponse of (Media media) {
        return MediaInfoResponse.builder()
                .id(media.getId())
                .userId(media.getUserId())
                .name(media.getName())
                .manager(media.getManager())
                .email(media.getEmail())
                .clickUrl(media.getClickUrl())
                .installPostback(media.getInstallPostback())
                .eventPostback(media.getEventPostback())
                .createdAt(media.getCreatedAt())
                .build();
    }

}
