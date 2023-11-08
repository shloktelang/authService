package com.example.userservice.controllers;

import com.example.userservice.dtos.LoginDto;
import com.example.userservice.services.AuthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private AuthService authService;
    public AuthController(AuthService authService){
        this.authService=authService;
    }

    @GetMapping("/login")
    public String login(LoginDto loginDto){
        return authService.login(loginDto.getEmail(),loginDto.getPassword());
    }

    @GetMapping("/validate")
    public boolean isTokenValid(String token){
        return authService.isTokenValid(token);
    }
}
