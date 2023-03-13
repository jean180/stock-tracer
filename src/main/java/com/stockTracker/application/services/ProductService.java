package com.stockTracker.application.services;

import com.stockTracker.application.entities.Product;
import com.stockTracker.application.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAllWithProductTypeName() {
        return productRepository.findAllWithProductTypeName();
    }
}
