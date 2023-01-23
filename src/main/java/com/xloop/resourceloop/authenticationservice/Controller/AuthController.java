package com.xloop.resourceloop.authenticationservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xloop.resourceloop.authenticationservice.JPARepository.UserRepository;
import com.xloop.resourceloop.authenticationservice.Model.User;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserRepository userRepo;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user){
        User exist_user = userRepo.findByEmail(user.getEmail());
        if(exist_user != null){
            return ResponseEntity.status(208).body("User Already Exist");
        }
        userRepo.save(user);
        return ResponseEntity.ok("User Registered");
    } 
}
