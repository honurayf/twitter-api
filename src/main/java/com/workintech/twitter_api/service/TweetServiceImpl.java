package com.workintech.twitter_api.service;

import com.workintech.twitter_api.dao.TweetRepository;
import com.workintech.twitter_api.dto.TweetDTO;
import com.workintech.twitter_api.dto.TweetResponseDTO;
import com.workintech.twitter_api.entity.Tweet;
import com.workintech.twitter_api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TweetServiceImpl implements TweetService {
    private final TweetRepository tweetRepository;

    @Autowired
    public TweetServiceImpl(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public TweetResponseDTO save(TweetDTO dto) {
        TweetResponseDTO tweetResponseDTO = new TweetResponseDTO();
        User user = new User();
        user.setId(dto.getUserId());
        Tweet tweet = new Tweet();
        tweet.setUser(user);
        tweet.setContent(dto.getContent());
        tweet.setCreateDate(dto.getCreatedDate());
        tweet.setUpdateDate(dto.getUpdatedDate());
        Tweet insertedTweet = tweetRepository.saveAndFlush(tweet);
        tweetResponseDTO.setTweetId(insertedTweet.getId());
        tweetResponseDTO.setIsSuccess(Boolean.TRUE);
        return tweetResponseDTO;
    }
}
