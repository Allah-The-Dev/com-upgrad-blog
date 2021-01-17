package com.upgrad.blog.comupgradblog.services;

import java.util.ArrayList;
import java.util.List;

import com.upgrad.blog.comupgradblog.models.Post;

import org.springframework.stereotype.Service;

@Service
public class BlogPostService {
    private static List<Post> BLOG_POST_LIST = new ArrayList<>(); 
    
    public List<Post> getBlogPostList () {
        return BLOG_POST_LIST;
    }

    public boolean addBlogPost(Post post) {
        return BLOG_POST_LIST.add(post);
    }
}
