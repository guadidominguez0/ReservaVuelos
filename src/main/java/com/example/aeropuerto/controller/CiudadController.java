package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Ciudad;
import com.example.aeropuerto.repository.RepositoryCiudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ciudads")
@CrossOrigin(origins = "http://localhost:8080")
public class CiudadController {

    @Autowired
    private RepositoryCiudad repositoryCiudad;

    // Obtener Ciudad por ID
    @GetMapping("/ciudad/{id}")
    public Ciudad getCiudad(@PathVariable Integer id) {
        return repositoryCiudad.findById(id).get();
    }

    // Obtener todas las Ciudads
    @GetMapping("/ciudads")
    public List<Ciudad> getCiudads() {
        return repositoryCiudad.findAll();
    }

    // Guardar
    @PostMapping("/guardarCiudad")
    public String post(@RequestBody Ciudad ciudad) {
        repositoryCiudad.save(ciudad);
        return "CIUDAD GUARDADO";
    }

    // Editar
    @PutMapping("/editarCiudad/{id}")
    public String update(@PathVariable Integer id, @RequestBody Ciudad ciudad) {
        Ciudad updateCiudad = repositoryCiudad.findById(id).get();
        // actualizar campos
        repositoryCiudad.save(updateCiudad);
        return "CIUDAD EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deleteCiudad/{id}")
    public String delete(@PathVariable Integer id) {
        Ciudad deleteCiudad = repositoryCiudad.findById(id).get();
        repositoryCiudad.delete(deleteCiudad);
        return "CIUDAD ELIMINADO";
    }
}