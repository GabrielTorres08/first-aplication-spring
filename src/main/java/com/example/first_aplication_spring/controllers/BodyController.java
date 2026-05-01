package com.example.first_aplication_spring.controllers;

import com.example.first_aplication_spring.models.UserModel;
import com.example.first_aplication_spring.services.BodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class BodyController {

    @Autowired
    private BodyService bodyService;

    @GetMapping("/")
    public String hello() {
        return bodyService.home("Gabriel");
    }

    @PostMapping("/contatos")
    public String usuario(@RequestBody UserModel userModel) {
        return "Olá " + userModel.getNome() + ", você possui " + userModel.getIdade() + " anos";
    }
}
