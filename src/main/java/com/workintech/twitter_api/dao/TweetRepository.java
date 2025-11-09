package com.workintech.twitter_api.dao;

import com.workintech.twitter_api.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
