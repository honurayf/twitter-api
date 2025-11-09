package com.workintech.twitter_api.service;

import com.workintech.twitter_api.dao.UserRepository;
import com.workintech.twitter_api.dto.UserDTO;
import com.workintech.twitter_api.dto.UserResponseDTO;
import com.workintech.twitter_api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserResponseDTO save(UserDTO dto) {
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        User user = new User();
        user.setEmail(dto.getEmail());
        user.setUserName(dto.getUserName());
        user.setPassword(dto.getPassword());
        User savedUser = userRepository.saveAndFlush(user);
        userResponseDTO.setUserId(savedUser.getId());
        userResponseDTO.setIsSuccess(Boolean.TRUE);
        return userResponseDTO;
    }

    @Override
    @Transactional(readOnly = true)
    public UserResponseDTO getUserByEmail(String email) {
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        User user = userRepository.getUserByEmail(email);
        if (user != null) {
            userResponseDTO.setIsSuccess(Boolean.TRUE);
            userResponseDTO.setUserId(user.getId());
        } else {
            userResponseDTO.setIsSuccess(Boolean.FALSE);
            userResponseDTO.setMessage("User not found");
        }
        return userResponseDTO;
    }
}
