package com.stockTracker.application.repositories;

import com.stockTracker.application.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // métodos personalizados de consulta

    User findFirstByEmail(String email);

}

