package com.example.first_aplication_spring.send_email;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    String email_provedor = System.getenv("EMAIL_PROVEDOR");

    @Autowired
    private JavaMailSender mailSender;

    public void enviarEmailHtml(String para, String assunto, String corpoHtml) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();

        // O parâmetro 'true' indica que você enviará mensagens "multipart" (com HTML, anexos, etc)
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");

        helper.setFrom(email_provedor);
        helper.setTo(para);
        helper.setSubject(assunto);

        // O segundo parâmetro 'true' confirma que o conteúdo é HTML
        helper.setText(corpoHtml, true);

        mailSender.send(message);
    }
}