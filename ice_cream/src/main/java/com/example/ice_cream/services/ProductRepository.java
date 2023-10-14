package com.example.ice_cream.services;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ice_cream.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
