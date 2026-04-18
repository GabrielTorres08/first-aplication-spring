package com.example.first_aplication_spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BodyController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}
