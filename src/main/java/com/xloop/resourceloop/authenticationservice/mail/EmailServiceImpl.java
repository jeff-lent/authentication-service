package com.xloop.resourceloop.authenticationservice.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.mail.MailException;

@Service("EmailService")
public class EmailServiceImpl implements EmailService {

  private static final String NOREPLY_ADDRESS = "hunainparekh85@gmail.com";

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(String to, String subject, String text) {
      try {
          SimpleMailMessage message = new SimpleMailMessage();
          message.setFrom(NOREPLY_ADDRESS);
          message.setTo(to);
          message.setSubject(subject);
          message.setText(text);
          emailSender.send(message);
      } catch (MailException exception) {
          exception.printStackTrace();
      }
  }
}