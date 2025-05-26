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

public class Usuario extends Persona{
    private int numeroUsuario;
    private String contaseniaUsuario;
    private String correoElectronicoUsuario;
    private Reserva reserva;
    private List<Consulta> consultas;
    private List <Tarjeta> tarjetas;
}
