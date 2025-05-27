package com.example.aeropuerto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Tarifa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroTarifa;
    @Basic
    private int impuestoTarifa;
    private int precioTarifa;
    @Enumerated(EnumType.STRING)
    private Clase claseTarifa;
    @ManyToOne
    private Vuelo vuelo;
}
