package com.example.shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shopping.model.order.Order;
import com.example.shopping.model.order.OrderStatus;
import com.example.shopping.model.users.User;

public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findOrdersByUser(User user);

	Order findOrderByUserAndOrderStatus(User user, OrderStatus ordered);
	
	
	

}
