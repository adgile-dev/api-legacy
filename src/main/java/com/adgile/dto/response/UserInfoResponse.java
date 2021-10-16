package com.adgile.dto.response;

import com.adgile.domain.User;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class UserInfoResponse {
    private Long id;
    private Integer type;
    private Integer userType;
    private String userId;
    private String name;
    private String manager;
    private String email;
    private Integer currencyType;
    private String invoiceEmail;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    @Builder
    public UserInfoResponse(Long id, Integer type, Integer userType, String userId, String name,
                            String manager, String email, Integer currencyType, String invoiceEmail,
                            LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.type = type;
        this.userType = userType;
        this.userId = userId;
        this.name = name;
        this.manager = manager;
        this.email = email;
        this.currencyType = currencyType;
        this.invoiceEmail = invoiceEmail;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static UserInfoResponse of (User user) {
        return UserInfoResponse.builder()
                .id(user.getId())
                .type(user.getType())
                .userType(user.getUserType())
                .userId(user.getUserId())
                .name(user.getName())
                .manager(user.getManager())
                .email(user.getEmail())
                .currencyType(user.getCurrencyType())
                .invoiceEmail(user.getInvoiceEmail())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .build();
    }
}
