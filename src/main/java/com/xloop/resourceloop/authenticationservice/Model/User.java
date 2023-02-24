package com.xloop.resourceloop.authenticationservice.Model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    @ManyToOne
    @JoinColumn(name="role_id",referencedColumnName="id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Role role;

    public User(){};

    public User(String first_name,String last_name,String email,String password){
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
    }
    public User(String first_name,String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }
    
}
