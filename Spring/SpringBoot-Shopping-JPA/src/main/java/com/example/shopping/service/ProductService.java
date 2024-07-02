package com.example.shopping.service;

import lombok.RequiredArgsConstructor;
import com.example.shopping.model.products.Product;
import com.example.shopping.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    // 전체 상품 조회
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // 상품 상세정보 조회
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

}
