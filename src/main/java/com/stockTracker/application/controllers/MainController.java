package com.stockTracker.application.controllers;

import com.stockTracker.application.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    UsuarioRepository repositorio;

    @GetMapping("/")
    public String welcome() {
        repositorio.findAll().forEach(usuario -> System.out.println(usuario.toString()));

        return "index";
    }
}
