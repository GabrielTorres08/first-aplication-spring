package com.example.first_aplication_spring.controllers;

import com.example.first_aplication_spring.models.UserModel;
import com.example.first_aplication_spring.send_email.EmailService;
import com.example.first_aplication_spring.services.BodyService;
import com.example.first_aplication_spring.template_email.TemplatesService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class BodyController {

    @Autowired
    private BodyService bodyService;
    @Autowired
    private EmailService emailService;
    @Autowired
    private TemplatesService templatesService;


    @GetMapping("/")
    public String hello() {
        String dbHost = System.getenv("EMAIL_PROVEDOR");
        return bodyService.home("Gabriel");
    }

    @PostMapping("/contatos")
    public String usuario(@RequestBody UserModel userModel) {
        return "Olá " + userModel.getNome() + ", você possui " + userModel.getIdade() + " anos";
    }

    @GetMapping("/send")
    public String enviar(
            @RequestParam(value = "para", required = false) String para,
            @RequestParam int tipo) throws MessagingException {
        if ((tipo == 0) && (para != null)) {
            emailService.enviarEmailHtml(para, templatesService.template_assunto00(), templatesService.template_corpo00());
            return "E-mail enviado!";
        } else {
            return "Algum dado está errado!";
        }

    }

}
