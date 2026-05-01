package com.example.first_aplication_spring.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class UserModel {
    private String nome;
    private int idade;
}
