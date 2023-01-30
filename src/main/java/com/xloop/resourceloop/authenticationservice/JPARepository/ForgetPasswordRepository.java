package com.xloop.resourceloop.authenticationservice.JPARepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xloop.resourceloop.authenticationservice.Model.ForgetPassword;

public interface ForgetPasswordRepository extends JpaRepository<ForgetPassword,Long>{
    
    public ForgetPassword findByEmailAndOtp(String email,String otp); 
}
