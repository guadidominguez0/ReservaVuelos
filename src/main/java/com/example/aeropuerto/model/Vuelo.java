package com.example.aeropuerto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroVuelo;
    @OneToOne
    private Avion avion;
    @OneToMany
    private List<Aeropuerto> aeropuertos;
    @OneToOne
    private Aerolinea aerolinea = new Aerolinea();
    @OneToOne
    private Fecha fecha;
    @OneToOne
    private Piloto piloto;
    @OneToMany
    private List<Tarifa> tarifas;
}
