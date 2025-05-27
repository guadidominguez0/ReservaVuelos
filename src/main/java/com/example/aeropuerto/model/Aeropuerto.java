package com.example.aeropuerto.model;

import jakarta.persistence.*;

@Entity
public class Aeropuerto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAeropuerto;
    @Basic
    private String nombreAeropuerto;
    @OneToOne
    private Ciudad ciudad;
}
