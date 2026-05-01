package com.example.first_aplication_spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BodyService {

    public String home(String name) {
        return "Hello World " + name;
    }
}
