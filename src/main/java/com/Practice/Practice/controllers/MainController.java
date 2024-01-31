package com.Practice.Practice.controllers;

import com.Practice.Practice.entities.User;
import com.Practice.Practice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String defaultHomepage(Model model, Principal principal) {
        if (principal != null) {
            String email = principal.getName();
            User user = userRepository.findByEmail(email);

            model.addAttribute("user", user);
        }

        return "index.html";
    }

    @GetMapping("/FoodZero")
    public String customHomepage(Model model) {
        model.addAttribute("title", "FoodZero");
        return "index.html";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About us");
        return "about.html";
    }

    @GetMapping("/portfolio")
    public String portfolio(Model model) {
        model.addAttribute("title", "Portfolio");
        return "portfolio";
    }

    @GetMapping("/soon")
    public String soon(Model model) {
        model.addAttribute("title", "Soon");
        return "soon.html";
    }

    @GetMapping("/menu")
    public String menu(Model model) {
        model.addAttribute("title", "Menu");
        return "menu.html";
    }

}