package com.stockTracker.application.controllers;

import com.stockTracker.application.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class PublicZoneController {

    @Autowired
    UserRepository repository;

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
