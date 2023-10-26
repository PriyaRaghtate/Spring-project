package com.priya.Registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priya.Registration.model.User;

public interface repo extends JpaRepository<User, Integer> {

}
