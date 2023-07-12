package com.consumer.consumer.services.implementation;

import com.consumer.consumer.entities.Product;
import com.consumer.consumer.repositories.ProductRepository;
import com.consumer.consumer.services.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Repository
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    /**
     * @param productId
     * @return
     */
    @Override
    public Product getProduct(UUID productId) {
        return productRepository.findById(productId).orElse(null);
    }

    /**
     * @return
     */
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * @param product
     * @return
     */
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    /**
     * @param product
     * @return
     */
    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    /**
     * @param productId@
     * @return
     */
    @Override
    public boolean deleteProduct(final UUID productId) {
        productRepository.deleteById(productId);
        return !productRepository.existsById(productId);
    }
}
