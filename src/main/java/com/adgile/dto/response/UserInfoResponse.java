package com.adgile.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 *

 *   int(11) unsigned NOT NULL AUTO_INCREMENT,
 *   tinyint(1) NOT NULL COMMENT '구분 (국내/해외)',
 *   tinyint(1) NOT NULL COMMENT '계정구분 0: 광고주 / 1:매체사',
 *   varchar(25) DEFAULT NULL COMMENT '계정 ID',
 *   varchar(25) NOT NULL COMMENT '광고주명 / 매체사명',
 *   varchar(25) NOT NULL COMMENT '담당자',
 *   varchar(100) NOT NULL COMMENT '이메일',
 *   tinyint(1) DEFAULT NULL COMMENT '통화기준 0:원 1:달러',
 *   varchar(100) DEFAULT NULL COMMENT '세금계산서 수신 메일',
 *   datetime NOT NULL COMMENT '생성시간',
 *   datetime DEFAULT NULL COMMENT '수정시간',
 *   `deleted_at` datetime DEFAULT NULL COMMENT '삭제시간',
 */
@Data
public class UserInfoResponse {
    private Long id;
    private Integer type;
    private Integer user_type;
    private String user_id;
    private String name;
    private String manager;
    private String email;
    private String currency_type;
    private String invoice_email;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;


    @Builder
    public
}
