package com.stockTracker.application.security;

import com.stockTracker.application.entities.User;
import com.stockTracker.application.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service()
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findFirstByEmail(username);

        UserBuilder builder = null;

        if (user != null) {
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.disabled(false);
            builder.password(user.getPassword());
            //TODO Agregar roles en BBDD y pasarselos al UserBuilder
            builder.authorities(new SimpleGrantedAuthority("ROLE_USER"));
        } else {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }

        return builder.build();
    }
}
