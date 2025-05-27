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
public class Tarjeta extends Pago{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroTarjeta;
    @Enumerated(EnumType.STRING)
    private TipoTarjeta tipoTarjeta;
}
