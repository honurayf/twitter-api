package com.workintech.twitter_api.controller.request;

import com.workintech.twitter_api.dto.TweetDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TweetRequest {
    private TweetDTO tweetDTO;

    public TweetRequest(TweetDTO tweetDTO) {
        this.tweetDTO = tweetDTO;
    }
}
