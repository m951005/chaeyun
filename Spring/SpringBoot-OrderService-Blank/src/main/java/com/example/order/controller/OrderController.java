package com.example.order.controller;

import com.example.order.model.order.OrderProductForm;
import com.example.order.model.product.Product;
import com.example.order.model.order.MyOrderDTO;
import com.example.order.model.order.Order;
import com.example.order.model.member.Member;
import com.example.order.repository.ProductRepository;
import com.example.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequestMapping("order")
@RequiredArgsConstructor
@Controller
public class OrderController {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    // 제품 주문하기
    @PostMapping("orderProduct")
    public String order(@SessionAttribute(value = "loginMember", required = false) Member loginMember,
    					@RequestParam Long product_id,
    					@Validated @ModelAttribute("product") OrderProductForm product,
    					BindingResult result) {
    	
    	log.info("product: {}", product);
    	Product findProductById = productRepository.findProductById(product_id);
    	if(result.hasErrors()) {
    		return "product/productInfo";
    	}
    	if(product.getCount() > findProductById.getStock()) {
    		result.reject("maxError", "재고 수량이 부족합니다.");
    		return "product/productInfo";
    	}
    	
    	Order order = OrderProductForm.toOrder(product);
    	order.setMember_id(loginMember.getMember_id());
    	order.calcOrderPrice(findProductById.getPrice());
    	orderRepository.saveOrder(order);
    	
    	findProductById.adjustStock(order.getCount());
    	productRepository.updateProduct(findProductById);
    	
    	log.info("order: {}", order);
    	
        return "redirect:/product/products";
    }

    // 내가 주문한 제품 목록
    @GetMapping("myOrders")
    public String myOrders(@SessionAttribute(value = "loginMember", required = false) Member loginMember,
    						Model model) {
    	List<Order> orders = orderRepository.findOrdersByMemberId(loginMember.getMember_id());
    	log.info("orders: {}", orders);
    	model.addAttribute("orders", orders);
    	
        return "order/myOrders";
    }

    // 주문 상세정보
    @GetMapping("orderInfo")
    public String orderInfo(@RequestParam Long order_id,
    						Model model) {
    	Order order = orderRepository.findOrderById(order_id);
    	Product product = productRepository.findProductById(order.getProduct_id());
    	
    	MyOrderDTO myOrderDTO = new MyOrderDTO();
    	myOrderDTO.setOrder(order);
    	myOrderDTO.setProduct(product);
    	
    	model.addAttribute("myOrderDTO", myOrderDTO);
    	
        return "order/orderInfo";
    }

    // 주문 취소
    @GetMapping("withdrawOrder")
    public String withdrawOrder(@RequestParam Long order_id) {
    	
    	Order order = orderRepository.findOrderById(order_id);
    	if(order == null) {
    		return "redirect:/order/myOrders";
    	}
    	orderRepository.removeOrderById(order_id);
    	//주문취소 시 재고량 조정
    	Product product = productRepository.findProductById(order.getProduct_id());
    	product.adjustStock(-(order.getCount()));
    	productRepository.updateProduct(product);
    	
        return "redirect:/order/myOrders";
    }
}
