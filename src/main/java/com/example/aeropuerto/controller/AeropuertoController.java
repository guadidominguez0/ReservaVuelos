package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Aeropuerto;
import com.example.aeropuerto.repository.RepositoryAeropuerto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aeropuertos")
@CrossOrigin(origins = "http://localhost:8080")
public class AeropuertoController {

    @Autowired
    private RepositoryAeropuerto repositoryAeropuerto;

    // Obtener Aeropuerto por ID
    @GetMapping("/aeropuerto/{id}")
    public Aeropuerto getAeropuerto(@PathVariable Integer id) {
        return repositoryAeropuerto.findById(id).get();
    }

    // Obtener todas las Aeropuertos
    @GetMapping("/aeropuertos")
    public List<Aeropuerto> getAeropuertos() {
        return repositoryAeropuerto.findAll();
    }

    // Guardar
    @PostMapping("/guardarAeropuerto")
    public String post(@RequestBody Aeropuerto aeropuerto) {
        repositoryAeropuerto.save(aeropuerto);
        return "AEROPUERTO GUARDADO";
    }

    // Editar
    @PutMapping("/editarAeropuerto/{id}")
    public String update(@PathVariable Integer id, @RequestBody Aeropuerto aeropuerto) {
        Aeropuerto updateAeropuerto = repositoryAeropuerto.findById(id).get();
        // actualizar campos
        repositoryAeropuerto.save(updateAeropuerto);
        return "AEROPUERTO EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deleteAeropuerto/{id}")
    public String delete(@PathVariable Integer id) {
        Aeropuerto deleteAeropuerto = repositoryAeropuerto.findById(id).get();
        repositoryAeropuerto.delete(deleteAeropuerto);
        return "AEROPUERTO ELIMINADO";
    }
}