package com.upgrad.blog.comupgradblog.controllers;

import java.util.List;

import com.upgrad.blog.comupgradblog.models.Post;
import com.upgrad.blog.comupgradblog.services.BlogPostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {

    @Autowired
    private BlogPostService blogPostService;

    @PostMapping("/post")
    public ResponseEntity<String> addPost(Post post) {
        post.setCreationDate();
        blogPostService.addBlogPost(post);
        return ResponseEntity.ok().body("Blog post got added successfully");
    }

    @GetMapping("/post")
    public ResponseEntity<List<Post>> getBlogPostList() {
        return ResponseEntity.ok().body(blogPostService.getBlogPostList());
    }
}
