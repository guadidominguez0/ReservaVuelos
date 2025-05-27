package com.example.aeropuerto.repository;

import com.example.aeropuerto.model.Avion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryAvion extends JpaRepository<Avion, Integer> {
}
