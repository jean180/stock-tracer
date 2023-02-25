package com.stockTracker.application.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;
    @Column(name = "name")
    private String name;
    @Column(name = "surnames")
    private String surnames;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
}
