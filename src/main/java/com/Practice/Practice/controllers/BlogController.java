package com.Practice.Practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/blogs")
    public String defaultHomepage(Model model) {
        model.addAttribute("title", "Blogs");
        return "blog.html";
    }

    @GetMapping("/blog-post")
    public String customHomepage(Model model) {
        model.addAttribute("title", "Blog-Post");
        return "blog-post.html";
    }
}
