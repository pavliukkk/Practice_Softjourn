package com.Practice.Practice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String defaultHomepage(Model model) {
        model.addAttribute("title", "FoodZero");
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

    @GetMapping("/contact")
    public String contactM(Model model) {
        model.addAttribute("title", "Get in touch");
        return "contact";
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