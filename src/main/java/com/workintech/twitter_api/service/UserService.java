package com.workintech.twitter_api.service;

import com.workintech.twitter_api.dto.UserDTO;
import com.workintech.twitter_api.dto.UserResponseDTO;

public interface UserService {

    UserResponseDTO save(UserDTO dto);

    UserResponseDTO getUserByEmail(String email);

}
