package com.example.first_aplication_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TemplateController {

    @GetMapping("/template")
    public String template() {
        return "home";
    }
}
