package com.example.userservice.services;

public interface AuthService {
    public String login(String username, String password);
    public boolean isTokenValid(String token);
}
