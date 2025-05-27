package com.example.aeropuerto.repository;

import com.example.aeropuerto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUsuario extends JpaRepository<Usuario, Integer> {
}
