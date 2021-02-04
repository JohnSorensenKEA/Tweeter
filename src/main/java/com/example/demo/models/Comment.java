package com.example.demo.models;

import java.util.ArrayList;

public class Comment {
    private int authorID;
    private String authorName;
    private int commentID;
    private int likes;
    private int retweets;
    private String text;

    private ArrayList<Comment> comments;
}
