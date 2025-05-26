package com.example.aeropuerto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Vuelo {
    private int numeroVuelo;
    private Avion avion;
    private List<Aeropuerto> aeropuertos;
    private Aerolinea aerolinea = new Aerolinea();
    private Fecha fecha;
    private Piloto piloto;
    private List<Tarifa> tarifas;
}
