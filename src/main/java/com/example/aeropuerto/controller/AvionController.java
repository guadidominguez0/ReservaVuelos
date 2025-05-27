package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Avion;
import com.example.aeropuerto.repository.RepositoryAvion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/avions")
@CrossOrigin(origins = "http://localhost:8080")
public class AvionController {

    @Autowired
    private RepositoryAvion repositoryAvion;

    // Obtener Avion por ID
    @GetMapping("/avion/{id}")
    public Avion getAvion(@PathVariable Integer id) {
        return repositoryAvion.findById(id).get();
    }

    // Obtener todas las Avions
    @GetMapping("/avions")
    public List<Avion> getAvions() {
        return repositoryAvion.findAll();
    }

    // Guardar
    @PostMapping("/guardarAvion")
    public String post(@RequestBody Avion avion) {
        repositoryAvion.save(avion);
        return "AVION GUARDADO";
    }

    // Editar
    @PutMapping("/editarAvion/{id}")
    public String update(@PathVariable Integer id, @RequestBody Avion avion) {
        Avion updateAvion = repositoryAvion.findById(id).get();
        // actualizar campos
        repositoryAvion.save(updateAvion);
        return "AVION EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deleteAvion/{id}")
    public String delete(@PathVariable Integer id) {
        Avion deleteAvion = repositoryAvion.findById(id).get();
        repositoryAvion.delete(deleteAvion);
        return "AVION ELIMINADO";
    }
}
