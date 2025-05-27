package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Tarjeta;
import com.example.aeropuerto.repository.RepositoryTarjeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tarjetas")
@CrossOrigin(origins = "http://localhost:8080")
public class TarjetaController {

    @Autowired
    private RepositoryTarjeta repositoryTarjeta;

    // Obtener Tarjeta por ID
    @GetMapping("/tarjeta/{id}")
    public Tarjeta getTarjeta(@PathVariable Integer id) {
        return repositoryTarjeta.findById(id).get();
    }

    // Obtener todas las Tarjetas
    @GetMapping("/tarjetas")
    public List<Tarjeta> getTarjetas() {
        return repositoryTarjeta.findAll();
    }

    // Guardar
    @PostMapping("/guardarTarjeta")
    public String post(@RequestBody Tarjeta tarjeta) {
        repositoryTarjeta.save(tarjeta);
        return "TARJETA GUARDADO";
    }

    // Editar
    @PutMapping("/editarTarjeta/{id}")
    public String update(@PathVariable Integer id, @RequestBody Tarjeta tarjeta) {
        Tarjeta updateTarjeta = repositoryTarjeta.findById(id).get();
        // actualizar campos
        repositoryTarjeta.save(updateTarjeta);
        return "TARJETA EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deleteTarjeta/{id}")
    public String delete(@PathVariable Integer id) {
        Tarjeta deleteTarjeta = repositoryTarjeta.findById(id).get();
        repositoryTarjeta.delete(deleteTarjeta);
        return "TARJETA ELIMINADO";
    }
}