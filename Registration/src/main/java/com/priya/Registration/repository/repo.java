package com.priya.Registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.priya.Registration.model.User;

public interface repo extends JpaRepository<User, Integer> {
@Query("SELECT u FROM User u WHERE u.email = ?1")
public User findByEmail(String email);
}
