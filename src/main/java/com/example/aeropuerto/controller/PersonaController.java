package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Persona;
import com.example.aeropuerto.repository.RepositoryPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = "http://localhost:8080")
public class PersonaController {

    @Autowired
    private RepositoryPersona repositoryPersona;

    // Obtener Persona por ID
    @GetMapping("/persona/{id}")
    public Persona getPersona(@PathVariable Integer id) {
        return repositoryPersona.findById(id).get();
    }

    // Obtener todas las Personas
    @GetMapping("/personas")
    public List<Persona> getPersonas() {
        return repositoryPersona.findAll();
    }

    // Guardar
    @PostMapping("/guardarPersona")
    public String post(@RequestBody Persona persona) {
        repositoryPersona.save(persona);
        return "PERSONA GUARDADO";
    }

    // Editar
    @PutMapping("/editarPersona/{id}")
    public String update(@PathVariable Integer id, @RequestBody Persona persona) {
        Persona updatePersona = repositoryPersona.findById(id).get();
        // actualizar campos
        repositoryPersona.save(updatePersona);
        return "PERSONA EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deletePersona/{id}")
    public String delete(@PathVariable Integer id) {
        Persona deletePersona = repositoryPersona.findById(id).get();
        repositoryPersona.delete(deletePersona);
        return "PERSONA ELIMINADO";
    }
}