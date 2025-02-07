package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import java.time.LocalDateTime;

@Entity
public class User {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private Long Id;
    private String fullName;
    private String email;
    private String phone;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    private String role;
    private LocalDateTime CreatedAt;
    private LocalDateTime UpdatedAt;

    public User() {
    }
    public User(String fullName, String email, String phone, String role, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.role = role;
        CreatedAt = createdAt;
        UpdatedAt = updatedAt;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        CreatedAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        UpdatedAt = updatedAt;
    }
}
