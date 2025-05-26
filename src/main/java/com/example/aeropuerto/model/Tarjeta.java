package com.example.aeropuerto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Tarjeta extends Pago{
    private int numeroTarjeta;
    private TipoTarjeta tipoTarjeta;
}
