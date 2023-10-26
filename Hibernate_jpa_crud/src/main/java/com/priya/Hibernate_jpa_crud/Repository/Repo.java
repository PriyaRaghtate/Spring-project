package com.priya.Hibernate_jpa_crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priya.Hibernate_jpa_crud.model.Product;

public interface Repo extends JpaRepository<Product, Integer> {

}
