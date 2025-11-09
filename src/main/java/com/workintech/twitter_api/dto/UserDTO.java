package com.workintech.twitter_api.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserDTO {

    private String userName;
    private String email;
    private String password;

}
