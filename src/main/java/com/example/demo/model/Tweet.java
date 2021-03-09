package com.example.demo.model;

import java.util.ArrayList;

public class Tweet {
    private int authorID;
    private String authorName;
    private int tweetID;
    private int likes;
    private int retweets;
    private String text;

    private ArrayList<Comment> comments;
}
