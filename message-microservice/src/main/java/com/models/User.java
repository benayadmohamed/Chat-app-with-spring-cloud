package com.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    @OneToOne
    private User user;
    @OneToMany
    private Collection<ChatHistory> chatHistories;
}
