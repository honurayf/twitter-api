package com.workintech.twitter_api.controller;

import com.workintech.twitter_api.controller.request.TweetRequest;
import com.workintech.twitter_api.controller.response.TweetResponse;
import com.workintech.twitter_api.dto.TweetResponseDTO;
import com.workintech.twitter_api.service.TweetService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tweet")
public class TweetController {
    private final TweetService tweetService;

    public TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }
    @PostMapping("/saveTweet")
    public TweetResponse saveTweet(@RequestBody TweetRequest tweetRequest) {
        TweetResponse tweetResponse = new TweetResponse();

        TweetResponseDTO dto = tweetService.save(tweetRequest.getTweetDTO());
        tweetResponse.setTweetDTO(dto);

        return tweetResponse;
    }
}
