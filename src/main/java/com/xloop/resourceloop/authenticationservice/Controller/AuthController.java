package com.xloop.resourceloop.authenticationservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xloop.resourceloop.authenticationservice.Classes.Auth;
import com.xloop.resourceloop.authenticationservice.JPARepository.UserRepository;
import com.xloop.resourceloop.authenticationservice.Model.User;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserRepository userRepo;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user){
        User userExists = userRepo.findByEmail(user.getEmail());
        if(userExists != null){
            return ResponseEntity.status(409).body("User Already Exist");
        }
        userRepo.save(user);
        return ResponseEntity.ok("User Registered");
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody Auth auth){
        User user = userRepo.findByEmailAndPassword(auth.getEmail(), auth.getPassword());
        if(user == null){
            return ResponseEntity.status(404).body(null);
        }
        return ResponseEntity.status(200).body(user);
    }

    @PostMapping("/forgetpassword/{id}")
    public ResponseEntity<String> resetPassword(@PathVariable Long id ,@RequestBody String new_password){
        User user = userRepo.findById(id).orElse(null);
        user.setPassword(new_password);
        userRepo.save(user);
        return ResponseEntity.status(200).body("Password Updated Successfully");
    } 
}
