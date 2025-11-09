package com.workintech.twitter_api.controller.request;

import com.workintech.twitter_api.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private UserDTO userDTO;

    public UserRequest(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
