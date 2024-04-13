package com.dev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
