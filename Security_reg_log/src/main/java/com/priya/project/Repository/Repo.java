package com.priya.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priya.project.Model.User;

public interface Repo extends JpaRepository<User, Integer> {

}
