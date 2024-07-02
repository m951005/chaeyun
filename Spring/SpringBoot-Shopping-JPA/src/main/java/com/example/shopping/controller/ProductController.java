package com.example.shopping.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.example.shopping.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Slf4j
@RequiredArgsConstructor
@Controller
public class ProductController {

    private final ProductService productService;

    // 상품목록
    @GetMapping("products")
    public String listProducts(Model model) {
        log.info("상품 목록 출력");
        model.addAttribute("products", productService.getAllProducts());

        return "products/products";
    }

    // 상품 상세정보
    @GetMapping("products/{id}")
    public String getProductDetails(@PathVariable(name = "id") Long id,
                                    Model model) {
        log.info("상품 상세정보 출력");
        model.addAttribute("product", productService.getProductById(id));

        return "products/productDetails";
    }

}
