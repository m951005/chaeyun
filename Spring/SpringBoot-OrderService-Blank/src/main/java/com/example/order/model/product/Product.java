package com.example.order.model.product;

import com.example.order.model.order.OrderProductForm;
import lombok.Data;

@Data
public class Product {
    private Long product_id;
    private String product_name;
    private int stock;
    private long price;

    public void adjustStock(Integer count) {
        this.stock = this.stock - count;
    }

    public static OrderProductForm toOrderProductForm(Product product) {
        OrderProductForm orderProductForm = new OrderProductForm();
        orderProductForm.setProduct_id(product.product_id);
        orderProductForm.setProduct_name(product.getProduct_name());
        orderProductForm.setStock(product.getStock());
        orderProductForm.setPrice(product.getPrice());
        orderProductForm.setCount(1);

        return orderProductForm;
    }
}
