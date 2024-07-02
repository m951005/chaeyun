package com.example.shopping.model.order;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderStatus {
    ORDERED("주문 전"),   // 주문 전
    COMPLETED("주문 완료"), // 주문 완료
    CANCELLED("주문 취소");  // 주문 취소

    private final String description;
}
