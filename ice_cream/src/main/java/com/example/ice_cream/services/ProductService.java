package com.example.ice_cream.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ice_cream.model.Product;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProduct(String id) {
        return productRepository.findById(id);
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(String id, Product producto) {
        producto.setId(id);
        return productRepository.save(producto);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
