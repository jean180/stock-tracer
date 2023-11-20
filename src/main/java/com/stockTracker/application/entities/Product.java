package com.stockTracker.application.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "weight_type")
    @JsonIgnoreProperties({"hibernateLazyInitializer"})
    private Weight_Type weight_type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_type")
    @JsonIgnoreProperties({"hibernateLazyInitializer"})
    private Product_Type product_type;
}
