package com.stockTracker.application.services;

import com.stockTracker.application.entities.User;
import com.stockTracker.application.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void register(User user) throws Exception{
        if (userRepository.findFirstByEmail(user.getEmail()) == null) {
            userRepository.save(user);
        } else {
            throw new Exception("Usuario ya registrado");
        }
    }
}
