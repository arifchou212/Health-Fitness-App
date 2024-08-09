package com.example.healthfitnessapp.repository;

import com.example.healthfitnessapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

