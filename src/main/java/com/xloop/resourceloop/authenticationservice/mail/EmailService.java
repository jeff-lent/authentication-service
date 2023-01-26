package com.xloop.resourceloop.authenticationservice.mail;


public interface EmailService {
    public void sendSimpleMessage(String to, String subject, String text);
}
