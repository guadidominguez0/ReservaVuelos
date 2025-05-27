package com.example.aeropuerto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Fecha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFecha;
    @Temporal(TemporalType.DATE)
    private Date fecha;
}
