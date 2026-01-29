package com.blog.blog_pessoal.controller;

import com.blog.blog_pessoal.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.io.IOException;

@Controller
public class GuestController {

    private final ArticleService articleService;

    public GuestController(ArticleService articleService){
        this.articleService = articleService;
    }
    @GetMapping("/")
    public String home(Model model) throws IOException {
        model.addAttribute("articles", articleService.findAll());
        return "home";
    }
}
