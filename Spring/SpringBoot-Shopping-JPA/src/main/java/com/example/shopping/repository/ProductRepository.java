package com.example.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shopping.model.products.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
