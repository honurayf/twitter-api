package com.workintech.twitter_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "retweet", schema = "fsweb")
@AllArgsConstructor
@NoArgsConstructor
public class Retweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "tweet_no")
    private Long tweetNo;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
