package com.Ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.Ecommerce.entity.User;

import org.springframework.ui.Model;

@Controller
public class Authcontrolller {
    
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("attributeName"`, new User()); // Replace Object with your User DTO class
        return "register";
    }

}