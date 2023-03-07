package com.stockTracker.application.controllers;

import com.stockTracker.application.entities.User;
import com.stockTracker.application.exceptions.UserAlreadyExistsException;
import com.stockTracker.application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index() {
        return "redirect:/public/";
    }

    @GetMapping("/auth/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/auth/register")
    public String register(Model model, @ModelAttribute User user) throws UserAlreadyExistsException {
        try {
            userService.register(user);
        } catch (UserAlreadyExistsException e) {
            model.addAttribute("userAlreadyExist", e.getMessage());
            return "redirect:/auth/login?userAlreadyExist";
        }
        return "redirect:/auth/login";
    }
}
