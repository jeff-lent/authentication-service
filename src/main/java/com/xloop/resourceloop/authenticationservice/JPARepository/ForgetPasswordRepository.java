package com.xloop.resourceloop.authenticationservice.JPARepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xloop.resourceloop.authenticationservice.Model.ForgetPassword;

public interface ForgetPasswordRepository extends JpaRepository<ForgetPassword,Long>{
    
    public ForgetPassword findByEmailAndOtp(String email,String otp);

    public List<ForgetPassword> findByEmail(String email);
}
