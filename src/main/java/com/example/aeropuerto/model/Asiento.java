package com.example.aeropuerto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Asiento {
    private int idAsiento;
    private int filaAsiento;
    private char letraAsiento;
    private Clase claseAsiento;
}
