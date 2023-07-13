package com.consumer.consumer.controller;

import com.consumer.consumer.entities.Product;
import com.consumer.consumer.services.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {
    private final ProductService productService;
@Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public String getAllProducts() {
        return productService.getAllProducts().toString();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String getProduct(@PathVariable UUID productId) {
        return productService.getProduct(productId).toString();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createProduct(Product product) {
        return productService.createProduct(product).toString();
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public String updateProduct(Product product) {
        return productService.updateProduct(product).toString();
    }
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteProduct(@PathVariable UUID productId) {
        return productService.deleteProduct(productId);
    }

}
