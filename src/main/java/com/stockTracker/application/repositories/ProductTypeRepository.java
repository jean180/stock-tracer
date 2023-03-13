package com.stockTracker.application.repositories;

import com.stockTracker.application.entities.Product_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<Product_Type, Long> {

}
