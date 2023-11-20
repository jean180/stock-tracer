package com.stockTracker.application.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "weight_type")
public class Weight_Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "abbreviation")
    private String abbreviation;
}
