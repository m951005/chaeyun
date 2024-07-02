package com.example.shopping.model.order;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.example.shopping.model.users.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Getter @Setter
@Table(name = "orders")
@Entity
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items = new ArrayList<>();

    private long totalAmount;

    private LocalDateTime orderDate;

    public Order(User user) {
        this.user = user;
        orderStatus = OrderStatus.ORDERED;
        orderDate = LocalDateTime.now();
    }

    // 총 금액 계산
    private void calculateTotalAmount() {
        totalAmount = 0;
        for (OrderItem item : items) {
            totalAmount += item.getPrice();
        }
    }

    // 상품 추가
    public void addItem(OrderItem item) {
        items.add(item);
        item.getProduct().setStockQuantity(item.getProduct().getStockQuantity() - item.getQuantity());
        item.setOrder(this);
        calculateTotalAmount();
    }

    // 상품 삭제
    public void removeItem(OrderItem item) {
        items.remove(item);
        item.getProduct().setStockQuantity(item.getProduct().getStockQuantity() + item.getQuantity());
        calculateTotalAmount();
    }

    // 모든 상품 삭제
    public void removeAllItems() {
        if (!items.isEmpty()) {
            for (OrderItem item : items) {
                item.getProduct().setStockQuantity(item.getProduct().getStockQuantity() + item.getQuantity());
            }
        }
    }

    // 주문 상태 변경
    public void updateStatus(OrderStatus newStatus) {
        this.orderStatus = newStatus;
    }
}
