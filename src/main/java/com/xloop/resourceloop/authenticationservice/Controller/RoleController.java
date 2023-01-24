package com.xloop.resourceloop.authenticationservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xloop.resourceloop.authenticationservice.JPARepository.RoleRepository;
import com.xloop.resourceloop.authenticationservice.Model.Role;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    
    @Autowired
    private RoleRepository roleRepo;


    @PostMapping("")
    public ResponseEntity<String> saveRole(@RequestBody Role role){
        roleRepo.save(role);
        return ResponseEntity.ok("Role Created");
    }

    @GetMapping("")
    public List<Role> getAllRoles(){
        return roleRepo.findAll();
    }
}
