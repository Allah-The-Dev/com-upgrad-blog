package com.upgrad.blog.comupgradblog.models;

import java.time.LocalDateTime;

public class Post {
    private int id;
    private String title;
    private String body;
    private LocalDateTime creationDate;

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate() {
        this.creationDate = LocalDateTime.now();
    }

    public Post(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.creationDate = LocalDateTime.now();
    }


}
