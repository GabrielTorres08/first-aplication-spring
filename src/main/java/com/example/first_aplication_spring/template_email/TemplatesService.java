package com.example.first_aplication_spring.template_email;

import org.springframework.stereotype.Service;

@Service
public class TemplatesService {

    public String template_corpo00() {
        String htmlContent = "<h1>Bem-vindo!</h1><p>Clique <a href='https://google.com'>aqui</a> para ativar sua conta.</p>";
        return htmlContent;
    }

    public String template_assunto00() {
        String assunto = "Esse é um teste para o primero template";
        return assunto;
    }
}
