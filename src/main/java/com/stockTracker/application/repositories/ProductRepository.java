package com.stockTracker.application.repositories;

import com.stockTracker.application.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p INNER JOIN p.product_type pt")
    List<Product> findAllWithProductTypeName();

}
