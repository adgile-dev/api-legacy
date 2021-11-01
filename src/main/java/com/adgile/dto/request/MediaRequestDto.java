package com.adgile.dto.request;

import lombok.Data;

public class MediaRequestDto {

    @Data
    public static class create {
        private Long id;
        private Long userId;
        private String name;
        private String manager;
        private String email;
        private String clickUrl;
        private String installPostback;
        private String eventPostback;
    }

    @Data
    public static class update {
        private Long id;
        private Long userId;
        private String name;
        private String manager;
        private String email;
        private String clickUrl;
        private String installPostback;
        private String eventPostback;
    }
}
