package com.stockTracker.application.controllers;

import com.stockTracker.application.entities.Product;
import com.stockTracker.application.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/addList")
    public ResponseEntity<String> addProductList(@RequestBody List<Product> productList) {

        try {
            productService.addProductList(productList);
            return ResponseEntity.ok("Products added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error while adding the products");
        }

    }
}
