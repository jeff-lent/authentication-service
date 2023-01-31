package com.xloop.resourceloop.authenticationservice.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "forget_password")
@Getter
public class ForgetPassword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String email;
    @Setter
    private String otp;
    @Setter
    private Boolean is_expire;

    public ForgetPassword(){

    }
    public ForgetPassword(String email, String otp,Boolean is_expire){
        this.email = email;
        this.otp = otp;
        this.is_expire = is_expire;
    }

}
