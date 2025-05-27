package com.example.aeropuerto.repository;

import com.example.aeropuerto.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPersona extends JpaRepository<Persona, Integer> {
}
