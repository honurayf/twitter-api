package com.workintech.twitter_api.controller.request;

import com.workintech.twitter_api.dto.TweetDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TweetRequest {
    private TweetDTO tweetDTO;

}
