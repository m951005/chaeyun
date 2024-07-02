package com.example.shopping.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.example.shopping.model.order.Order;
import com.example.shopping.model.order.OrderItem;
import com.example.shopping.model.order.OrderStatus;
import com.example.shopping.model.users.User;
import com.example.shopping.repository.OrderItemRepository;
import com.example.shopping.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;

    // 주문 목록 조회
    public List<Order> getAllOrders(User user) {
        return orderRepository.findOrdersByUser(user);
    }

    // 주문 정보에 상품 추가
    @Transactional
    public Order addOrderItem(User user, OrderItem orderItem) {
        // 주문 전 상태의 Order 가 있는지 확인
        Order order = orderRepository.findOrderByUserAndOrderStatus(user, OrderStatus.ORDERED);
        // 주문 전 상태의 Order 가 없으면 새로 생성한다.
        if (order == null) {
            order = new Order(user);
        }
        order.addItem(orderItem);
        orderRepository.save(order);

        return order;
    }

    // 주문 정보 상세 보기
    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    // 주문 정보에서 상품 삭제
    @Transactional
    public void removeOrderItem(Long orderId, Long orderItemId) {
        Optional<Order> order = orderRepository.findById(orderId);
        order.ifPresent(o -> {
            Optional<OrderItem> orderItem = orderItemRepository.findById(orderItemId);
            orderItem.ifPresent(oi -> {
                o.removeItem(oi);
                orderItemRepository.deleteById(oi.getId());
            });
            if (o.getItems().isEmpty()) {
                orderRepository.delete(o);
            }
        });
    }

    // 주문 완료
    @Transactional
    public void completeOrder(Long orderId) {
        Optional<Order> order = orderRepository.findById(orderId);
        order.ifPresent(o -> {
            o.setOrderStatus(OrderStatus.COMPLETED);
        });
    }

    // 주문 취소
    @Transactional
    public void cancelOrder(Long orderId) {
        Optional<Order> order = orderRepository.findById(orderId);
        order.ifPresent(o -> {
            o.removeAllItems();
            o.updateStatus(OrderStatus.CANCELLED);
        });
    }
}
