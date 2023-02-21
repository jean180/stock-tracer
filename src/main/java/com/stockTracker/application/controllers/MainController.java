package com.stockTracker.application.controllers;

import com.stockTracker.application.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    UsuarioRepository repository;
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("usuarios", repository.findAll());
        return "index";
    }
}
