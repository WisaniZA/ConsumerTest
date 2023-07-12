package com.consumer.consumer.services.interfaces;

import com.consumer.consumer.entities.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    Product getProduct(UUID productId);
    List<Product> getAllProducts();
    Product createProduct(Product product);
    Product updateProduct(Product product);
    boolean deleteProduct(UUID productId);
}
