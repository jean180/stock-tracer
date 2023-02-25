package com.stockTracker.application.services;

import com.stockTracker.application.entities.User;
import com.stockTracker.application.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User register(User user) {
        return userRepository.save(user);
    }
}
