package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Vuelo;
import com.example.aeropuerto.repository.RepositoryVuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/vuelos")
@CrossOrigin(origins = "http://localhost:8080")
public class VueloController {

    @Autowired
    private RepositoryVuelo repositoryVuelo;

    // Obtener Vuelo por ID
    @GetMapping("/vuelo/{id}")
    public Vuelo getVuelo(@PathVariable Integer id) {
        return repositoryVuelo.findById(id).get();
    }

    // Obtener todas las Vuelos
    @GetMapping("/vuelos")
    public List<Vuelo> getVuelos() {
        return repositoryVuelo.findAll();
    }

    // Guardar
    @PostMapping("/guardarVuelo")
    public String post(@RequestBody Vuelo vuelo) {
        repositoryVuelo.save(vuelo);
        return "VUELO GUARDADO";
    }

    // Editar
    @PutMapping("/editarVuelo/{id}")
    public String update(@PathVariable Integer id, @RequestBody Vuelo vuelo) {
        Vuelo updateVuelo = repositoryVuelo.findById(id).get();
        // actualizar campos
        repositoryVuelo.save(updateVuelo);
        return "VUELO EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deleteVuelo/{id}")
    public String delete(@PathVariable Integer id) {
        Vuelo deleteVuelo = repositoryVuelo.findById(id).get();
        repositoryVuelo.delete(deleteVuelo);
        return "VUELO ELIMINADO";
    }
}