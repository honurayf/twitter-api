package com.workintech.twitter_api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {
    private Long userId;
    private Boolean isSuccess;
    private String message;
}
