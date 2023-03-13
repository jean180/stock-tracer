package com.stockTracker.application.services;

import com.stockTracker.application.repositories.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {

    @Autowired
    ProductTypeRepository productTypeRepository;

}
