package com.xloop.resourceloop.authenticationservice.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "users") 
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Setter
    private String first_name;
    @Setter
    private String last_name;
    @Setter
    private String email;
    @Setter
    private String password;
}
