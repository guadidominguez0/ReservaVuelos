package com.example.aeropuerto.repository;

import com.example.aeropuerto.model.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCiudad extends JpaRepository<Ciudad, Integer> {
}
