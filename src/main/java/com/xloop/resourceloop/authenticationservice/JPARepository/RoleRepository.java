package com.xloop.resourceloop.authenticationservice.JPARepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xloop.resourceloop.authenticationservice.Model.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{
    
}
