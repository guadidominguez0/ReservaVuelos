package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Consulta;
import com.example.aeropuerto.repository.RepositoryConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/consultas")
@CrossOrigin(origins = "http://localhost:8080")
public class ConsultaController {

    @Autowired
    private RepositoryConsulta repositoryConsulta;

    // Obtener Consulta por ID
    @GetMapping("/consulta/{id}")
    public Consulta getConsulta(@PathVariable Integer id) {
        return repositoryConsulta.findById(id).get();
    }

    // Obtener todas las Consultas
    @GetMapping("/consultas")
    public List<Consulta> getConsultas() {
        return repositoryConsulta.findAll();
    }

    // Guardar
    @PostMapping("/guardarConsulta")
    public String post(@RequestBody Consulta consulta) {
        repositoryConsulta.save(consulta);
        return "CONSULTA GUARDADO";
    }

    // Editar
    @PutMapping("/editarConsulta/{id}")
    public String update(@PathVariable Integer id, @RequestBody Consulta consulta) {
        Consulta updateConsulta = repositoryConsulta.findById(id).get();
        // actualizar campos
        repositoryConsulta.save(updateConsulta);
        return "CONSULTA EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deleteConsulta/{id}")
    public String delete(@PathVariable Integer id) {
        Consulta deleteConsulta = repositoryConsulta.findById(id).get();
        repositoryConsulta.delete(deleteConsulta);
        return "CONSULTA ELIMINADO";
    }
}