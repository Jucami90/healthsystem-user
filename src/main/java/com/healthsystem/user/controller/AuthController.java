package com.healthsystem.user.controller;

import com.healthsystem.user.dto.LoginRequest;
import com.healthsystem.user.utils.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public String login(@RequestBody LoginRequest request){
        if(request.getUsername().equals("juan@example.com") && request.getPassword().equals("123456")){
            return JwtUtil.generateToken(request.getUsername());
        }
        throw new RuntimeException("Invalid credentials");
    }
}
