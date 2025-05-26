package com.example.aeropuerto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Tarifa {
    private int numeroTarifa;
    private int impuestoTarifa;
    private int precioTarifa;
    private Clase claseTarifa;
    private Vuelo vuelo;
}
