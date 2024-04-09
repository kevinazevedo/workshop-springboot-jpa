package com.dev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
