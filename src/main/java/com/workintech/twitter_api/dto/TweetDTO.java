package com.workintech.twitter_api.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TweetDTO {
    private Long userId;
    private String content;
    private Date createdDate;
    private Date updatedDate;

}
