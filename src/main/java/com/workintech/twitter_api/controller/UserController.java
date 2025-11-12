package com.workintech.twitter_api.controller;

import com.workintech.twitter_api.controller.request.UserRequest;
import com.workintech.twitter_api.controller.response.UserResponse;
import com.workintech.twitter_api.dto.UserResponseDTO;
import com.workintech.twitter_api.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public UserResponse saveUser(@RequestBody UserRequest userRequest) {
        UserResponse userResponse = new UserResponse();
        UserResponseDTO dto = userService.save(userRequest.getUserDTO());
        userResponse.setUserDTO(dto);
        return userResponse;

    }

    @GetMapping("/getUserByEmail")
    public UserResponse getUserByEmail(@RequestBody String email) {
        UserResponse userResponse = new UserResponse();
        UserResponseDTO dto = userService.getUserByEmail(email);
        userResponse.setUserDTO(dto);
        return userResponse;
    }
}
