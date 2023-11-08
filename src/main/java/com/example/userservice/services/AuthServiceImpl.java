package com.example.userservice.services;

import com.example.userservice.models.Session;
import com.example.userservice.repositories.SessionRepository;
import com.example.userservice.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class AuthServiceImpl implements AuthService{

    UserRepository userRepository;
    SessionRepository sessionRepository;

    public AuthServiceImpl(UserRepository userRepository, SessionRepository sessionRepository) {
        this.userRepository = userRepository;
        this.sessionRepository = sessionRepository;
    }
    public String login(String username, String password) {
        String characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder randomString = new StringBuilder(20);

        for (int i = 0; i < 20; i++) {
            int randomIndex = random.nextInt(characterSet.length());
            char randomChar = characterSet.charAt(randomIndex);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }

    public boolean isTokenValid(String token) {
        Optional<Session> session = sessionRepository.findByToken(token);
        return session.isPresent();
    }
}
