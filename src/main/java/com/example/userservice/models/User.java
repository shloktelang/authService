package com.example.userservice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Users")
public class User extends BaseModel{
    private String email;
    private String password;
    private String fullName;
}
