package com.example.aeropuerto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Reserva {
    private int numeroReserva;
    private Pago pago;
    private Vuelo vueloReservado;
}
