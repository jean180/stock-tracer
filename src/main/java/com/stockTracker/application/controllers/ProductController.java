package com.stockTracker.application.controllers;

import com.stockTracker.application.entities.Product;
import com.stockTracker.application.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("getAll")
    public String getAll(Model model) {

        List<Product> products = productService.findAllWithProductTypeName();
        model.addAttribute("products", products);
        return "product/productList.html";
    }

}
