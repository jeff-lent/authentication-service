package com.xloop.resourceloop.authenticationservice.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailApplicationDemo {
    
    @Autowired
    private EmailServiceImpl senderService;

    public static void main(String[] args) {
        SpringApplication.run(EmailApplicationDemo.class, args);
        
    }
    // @EventListener(ApplicationReadyEvent.class)
    // public void sendMail(){
    //     senderService.sendSimpleMessage("hunain.parekh@xloopdigital.com", "Demo Mail", "Hi, Hassan....");
    // }
}
