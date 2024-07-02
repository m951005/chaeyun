package com.example.order.model.order;

import com.example.order.model.product.Product;
import lombok.Data;

@Data
public class MyOrderDTO {
    private Order order;        // 주문 정보
    private Product product;    // 제품 정보
}
