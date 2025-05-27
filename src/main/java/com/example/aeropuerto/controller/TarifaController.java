package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Tarifa;
import com.example.aeropuerto.repository.RepositoryTarifa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tarifas")
@CrossOrigin(origins = "http://localhost:8080")
public class TarifaController {

    @Autowired
    private RepositoryTarifa repositoryTarifa;

    // Obtener Tarifa por ID
    @GetMapping("/tarifa/{id}")
    public Tarifa getTarifa(@PathVariable Integer id) {
        return repositoryTarifa.findById(id).get();
    }

    // Obtener todas las Tarifas
    @GetMapping("/tarifas")
    public List<Tarifa> getTarifas() {
        return repositoryTarifa.findAll();
    }

    // Guardar
    @PostMapping("/guardarTarifa")
    public String post(@RequestBody Tarifa tarifa) {
        repositoryTarifa.save(tarifa);
        return "TARIFA GUARDADO";
    }

    // Editar
    @PutMapping("/editarTarifa/{id}")
    public String update(@PathVariable Integer id, @RequestBody Tarifa tarifa) {
        Tarifa updateTarifa = repositoryTarifa.findById(id).get();
        // actualizar campos
        repositoryTarifa.save(updateTarifa);
        return "TARIFA EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deleteTarifa/{id}")
    public String delete(@PathVariable Integer id) {
        Tarifa deleteTarifa = repositoryTarifa.findById(id).get();
        repositoryTarifa.delete(deleteTarifa);
        return "TARIFA ELIMINADO";
    }
}