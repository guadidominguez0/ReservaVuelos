package com.example.aeropuerto.repository;

import com.example.aeropuerto.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryReserva extends JpaRepository<Reserva, Integer> {
}
