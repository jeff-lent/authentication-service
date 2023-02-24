package com.xloop.resourceloop.authenticationservice.Classes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Auth {
    private String email;
    private String password;

    public Auth(){}

    public Auth(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
