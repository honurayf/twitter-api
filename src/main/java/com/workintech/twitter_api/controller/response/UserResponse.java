package com.workintech.twitter_api.controller.response;

import com.workintech.twitter_api.dto.UserResponseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserResponse {
    private UserResponseDTO userDTO;
}
