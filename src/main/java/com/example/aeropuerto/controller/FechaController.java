package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Fecha;
import com.example.aeropuerto.repository.RepositoryFecha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/fechas")
@CrossOrigin(origins = "http://localhost:8080")
public class FechaController {

    @Autowired
    private RepositoryFecha repositoryFecha;

    // Obtener Fecha por ID
    @GetMapping("/fecha/{id}")
    public Fecha getFecha(@PathVariable Integer id) {
        return repositoryFecha.findById(id).get();
    }

    // Obtener todas las Fechas
    @GetMapping("/fechas")
    public List<Fecha> getFechas() {
        return repositoryFecha.findAll();
    }

    // Guardar
    @PostMapping("/guardarFecha")
    public String post(@RequestBody Fecha fecha) {
        repositoryFecha.save(fecha);
        return "FECHA GUARDADO";
    }

    // Editar
    @PutMapping("/editarFecha/{id}")
    public String update(@PathVariable Integer id, @RequestBody Fecha fecha) {
        Fecha updateFecha = repositoryFecha.findById(id).get();
        // actualizar campos
        repositoryFecha.save(updateFecha);
        return "FECHA EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deleteFecha/{id}")
    public String delete(@PathVariable Integer id) {
        Fecha deleteFecha = repositoryFecha.findById(id).get();
        repositoryFecha.delete(deleteFecha);
        return "FECHA ELIMINADO";
    }
}