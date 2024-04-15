package com.dev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.course.entities.OrderItem;
import com.dev.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
