package com.workintech.twitter_api.service;

import com.workintech.twitter_api.dto.TweetDTO;
import com.workintech.twitter_api.dto.TweetResponseDTO;

public interface TweetService {

    TweetResponseDTO save(TweetDTO dto);
}
