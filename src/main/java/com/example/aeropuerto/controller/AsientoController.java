package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Asiento;
import com.example.aeropuerto.repository.RepositoryAsiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/asientos")
@CrossOrigin(origins = "http://localhost:8080")
public class AsientoController {

    @Autowired
    private RepositoryAsiento repositoryAsiento;

    // Obtener Asiento por ID
    @GetMapping("/asiento/{id}")
    public Asiento getAsiento(@PathVariable Integer id) {
        return repositoryAsiento.findById(id).get();
    }

    // Obtener todas las Asientos
    @GetMapping("/asientos")
    public List<Asiento> getAsientos() {
        return repositoryAsiento.findAll();
    }

    // Guardar
    @PostMapping("/guardarAsiento")
    public String post(@RequestBody Asiento asiento) {
        repositoryAsiento.save(asiento);
        return "ASIENTO GUARDADO";
    }

    // Editar
    @PutMapping("/editarAsiento/{id}")
    public String update(@PathVariable Integer id, @RequestBody Asiento asiento) {
        Asiento updateAsiento = repositoryAsiento.findById(id).get();
        // actualizar campos
        repositoryAsiento.save(updateAsiento);
        return "ASIENTO EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deleteAsiento/{id}")
    public String delete(@PathVariable Integer id) {
        Asiento deleteAsiento = repositoryAsiento.findById(id).get();
        repositoryAsiento.delete(deleteAsiento);
        return "ASIENTO ELIMINADO";
    }
}
