package com.example.shopping.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.example.shopping.model.order.Order;
import com.example.shopping.model.order.OrderItem;
import com.example.shopping.model.products.Product;
import com.example.shopping.model.users.User;
import com.example.shopping.service.OrderService;
import com.example.shopping.service.ProductService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Controller
public class OrderController {

    private final OrderService orderService;
    private final ProductService productService;

    // 전체 주문 목록
    @GetMapping("orders")
    public String listOrders(@SessionAttribute(name = "loginUser") User loginUser,
                             Model model) {
        List<Order> orders = orderService.getAllOrders(loginUser);
        model.addAttribute("orders", orders);

        return "orders/orders";
    }

    // 장바구니 담기
    @PostMapping("orders/add")
    public String addOrderItem(@SessionAttribute(name = "loginUser") User loginUser,
                           @ModelAttribute OrderItem orderItem) {
        Product product = productService.getProductById(orderItem.getProduct().getId());
        orderItem.setProduct(product);
        Order order = orderService.addOrderItem(loginUser, orderItem);
        log.info("orderItem.product: {}", orderItem.getProduct());

        return "redirect:/orders/" + order.getId();
    }

    // 장바구니 상세
    @GetMapping("orders/{orderId}")
    public String getOrderDetails(@SessionAttribute(name = "loginUser") User loginUser,
                                  @PathVariable(name = "orderId") Long orderId,
                                  Model model) {
        Order order = orderService.getOrderById(orderId);
        model.addAttribute("order", order);
        return "orders/orderDetails";
    }

    // 장바구니 상품 삭제
    @GetMapping("orders/remove/{orderId}/{orderItemId}")
    public String removeOrderItem(@SessionAttribute(name = "loginUser") User loginUser,
                                  @PathVariable(name = "orderId") Long orderId,
                                  @PathVariable(name = "orderItemId") Long orderItemId) {
        orderService.removeOrderItem(orderId, orderItemId);
        return "redirect:/orders";
    }

    // 주문 하기
    @GetMapping("orders/completeOrder/{orderId}")
    public String completeOrder(@PathVariable(name = "orderId") Long orderId) {
        orderService.completeOrder(orderId);
        return "redirect:/orders";
    }

    // 주문 취소
    @GetMapping("orders/cancelOrder/{orderId}")
    public String cancelOrder(@PathVariable(name = "orderId") Long orderId) {
        orderService.cancelOrder(orderId);
        return "redirect:/orders";
    }
}
