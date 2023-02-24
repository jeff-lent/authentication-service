package com.xloop.resourceloop.authenticationservice.Classes;
import java.util.Random;

public class OTPGeneration {

    public static String OTP(int len)
    {
        // Using numeric values
        String numbers = "0123456789";

        String generated_otp = "";
  
        // Using random method
        Random rndm_method = new Random();
  
        char[] otp = new char[len];
  
        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
            generated_otp+= otp[i];
        }
        return generated_otp;
    }
}