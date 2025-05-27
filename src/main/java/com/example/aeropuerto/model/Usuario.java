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
public class Usuario extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroUsuario;
    @Basic
    private String contaseniaUsuario;
    private String correoElectronicoUsuario;
    @OneToOne
    private Reserva reserva;
    @OneToMany
    private List<Consulta> consultas;
    @OneToMany
    private List <Tarjeta> tarjetas;
}
