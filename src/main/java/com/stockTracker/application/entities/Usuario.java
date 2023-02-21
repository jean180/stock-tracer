package com.stockTracker.application.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;
    @Column(name = "name")
    private String nombre;
    @Column(name = "surnames")
    private String apellidos;
    @Column(name = "password")
    private String contraseña;
    @Column(name = "email")
    private String correoElectronico;
    @Column(name = "address")
    private String direccion;
    @Column(name = "phone_number")
    private String numeroTelefono;
    @Column(name = "birth_date")
    private Date fechaNacimiento;
}
