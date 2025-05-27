package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Piloto;
import com.example.aeropuerto.repository.RepositoryPiloto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pilotos")
@CrossOrigin(origins = "http://localhost:8080")
public class PilotoController {

    @Autowired
    private RepositoryPiloto repositoryPiloto;

    // Obtener Piloto por ID
    @GetMapping("/piloto/{id}")
    public Piloto getPiloto(@PathVariable Integer id) {
        return repositoryPiloto.findById(id).get();
    }

    // Obtener todas las Pilotos
    @GetMapping("/pilotos")
    public List<Piloto> getPilotos() {
        return repositoryPiloto.findAll();
    }

    // Guardar
    @PostMapping("/guardarPiloto")
    public String post(@RequestBody Piloto piloto) {
        repositoryPiloto.save(piloto);
        return "PILOTO GUARDADO";
    }

    // Editar
    @PutMapping("/editarPiloto/{id}")
    public String update(@PathVariable Integer id, @RequestBody Piloto piloto) {
        Piloto updatePiloto = repositoryPiloto.findById(id).get();
        // actualizar campos
        repositoryPiloto.save(updatePiloto);
        return "PILOTO EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deletePiloto/{id}")
    public String delete(@PathVariable Integer id) {
        Piloto deletePiloto = repositoryPiloto.findById(id).get();
        repositoryPiloto.delete(deletePiloto);
        return "PILOTO ELIMINADO";
    }
}