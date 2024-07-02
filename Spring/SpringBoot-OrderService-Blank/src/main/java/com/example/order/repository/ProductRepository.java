package com.example.order.repository;

import com.example.order.model.product.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductRepository {
    // 모든 제품 리스트
    List<Product> findProducts();

    // 제품 상세정보
    Product findProductById(Long product_id);

    // 제품 재고 수정
    void updateProduct(Product product);
}
