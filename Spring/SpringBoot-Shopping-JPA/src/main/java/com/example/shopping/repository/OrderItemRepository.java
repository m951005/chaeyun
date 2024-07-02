package com.example.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shopping.model.order.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
