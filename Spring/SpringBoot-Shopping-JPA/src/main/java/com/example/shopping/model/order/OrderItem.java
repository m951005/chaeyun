package com.example.shopping.model.order;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.shopping.model.products.Product;

@Data
@NoArgsConstructor
@Entity
public class OrderItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

    private long price;

    // 주문 상품 가격 계산
    private void calculatePrice() {
        if (product != null && quantity > 0) {
            price = getProduct().getPrice() * quantity;
        }
    }

    public void setProduct(Product product) {
        this.product = product;
        calculatePrice();
    }
}
