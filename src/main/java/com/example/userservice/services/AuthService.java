package com.example.userservice.services;

import com.example.userservice.dtos.UserDto;
import com.example.userservice.exceptions.UserAlreadyExistsException;
import com.example.userservice.exceptions.UserDoesNotExistException;
import com.example.userservice.models.SessionStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface AuthService {
    public ResponseEntity<UserDto> login(String email, String password) throws UserDoesNotExistException;
    public boolean isTokenValid(String token);
    public UserDto signup(String email, String password) throws UserAlreadyExistsException;
    public Optional<UserDto> validate(String token, Long userId);

    ResponseEntity<Void> logout(String token, Long userId);
}
