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
public class Asiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsiento;
    @Basic
    private int filaAsiento;
    private char letraAsiento;
    @Enumerated(EnumType.STRING)
    private Clase claseAsiento;
}
