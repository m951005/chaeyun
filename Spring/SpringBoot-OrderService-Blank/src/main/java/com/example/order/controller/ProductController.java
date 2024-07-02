package com.example.order.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.order.model.product.Product;
import com.example.order.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("product")
@Controller
public class ProductController {

    private final ProductRepository productRepository;

    // 제품 목록
    @GetMapping("products")
    public String list(Model model) {
    	List<Product> products = productRepository.findProducts();
    	model.addAttribute("products", products);
    	
        return "/product/productList";
    }

    // 제품 상세 페이지
    @GetMapping("productInfo")
    public String itemInfo(@RequestParam Long product_id,
    						Model model) {
    	log.info("id: {}",product_id);
    	Product findProductById = productRepository.findProductById(product_id);
    	log.info("product: {}", findProductById);
    	if(findProductById == null) {
    		return "redirect:/product/productList";
    	}
    	
    	model.addAttribute("product", Product.toOrderProductForm(findProductById));
    	
        return "/product/productInfo";
    }
}
