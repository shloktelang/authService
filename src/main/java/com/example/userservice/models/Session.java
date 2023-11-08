package com.example.userservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Sessions")
public class Session extends BaseModel{
    private String token;
    @ManyToOne
    private User user;
}
