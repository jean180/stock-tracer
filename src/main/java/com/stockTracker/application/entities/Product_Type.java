package com.stockTracker.application.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "product_type")
public class Product_Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
