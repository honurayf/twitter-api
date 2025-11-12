package com.workintech.twitter_api.controller;

import com.workintech.twitter_api.controller.request.TweetRequest;
import com.workintech.twitter_api.controller.response.TweetResponse;
import com.workintech.twitter_api.dto.TweetDTO;
import com.workintech.twitter_api.dto.TweetResponseDTO;
import com.workintech.twitter_api.service.TweetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TweetControllerTest {

    @Mock
    private TweetService tweetService;

    @InjectMocks
    private TweetController tweetController;

    private TweetDTO tweetDTO;
    private TweetResponseDTO tweetResponseDTO;
    private TweetRequest tweetRequest;

    @BeforeEach
    void setUp(){
        tweetDTO = new TweetDTO();
        tweetDTO.setUserId(1L);
        tweetDTO.setContent("Hello Twitter");

        tweetResponseDTO = new TweetResponseDTO();
        tweetResponseDTO.setTweetId(100L);

        tweetRequest = new TweetRequest();
        tweetRequest.setTweetDTO(tweetDTO);

    }

    @Test
    void saveTweet_ShouldReturnTweetResponseDTO() {
        when(tweetService.save(tweetDTO)).thenReturn(tweetResponseDTO);

        TweetResponse result = tweetController.saveTweet(tweetRequest);

        assertThat(result).isNotNull();
        assertThat(result.getTweetDTO().getTweetId()).isEqualTo(100L);

    }


}
