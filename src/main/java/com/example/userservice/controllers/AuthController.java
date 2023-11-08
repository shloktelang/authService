package com.example.userservice.controllers;

import com.example.userservice.dtos.LoginDto;
import com.example.userservice.services.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private AuthService authService;
    public AuthController(AuthService authService){
        this.authService=authService;
    }

    @PostMapping ("/login")
    public String login(@RequestBody LoginDto loginDto){
        return authService.login(loginDto.getEmail(),loginDto.getPassword());
    }

    @GetMapping("/validate/{token}")
    public boolean isTokenValid(@PathVariable("token") String token){
        return authService.isTokenValid(token);
    }
}
