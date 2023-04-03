package com.redis.redis.controller;

import com.redis.redis.model.Product;
import com.redis.redis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Product create(@RequestBody Product productParam) {
        return productService.create(productParam);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Product update(@RequestBody Product productParam) {
        return productService.update(productParam);
    }

    @RequestMapping("/get/{productId}")
    public Product getProduct(@PathVariable Long productId) throws InterruptedException {
        return productService.get(productId);
    }

}