package com.stockTracker.application.controllers;

import com.stockTracker.application.services.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productType")
public class ProductTypeController {

    @Autowired
    ProductTypeService productTypeService;

}
