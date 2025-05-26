package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Aerolinea;
import com.example.aeropuerto.repository.RepositoryAerolinea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aerolineas")
@CrossOrigin(origins = "http://localhost:8080")

public class AerolineaController {
    @Autowired
    private RepositoryAerolinea repositoryAerolinea;

    // Obtener Aerolinea por ID
    @GetMapping("aerolinea/{id}")
    public Aerolinea getAerolinea(@PathVariable Integer id) {
        return repositoryAerolinea.findById(id).get();
    }

    // Obtener todas las Aerolineas
    @GetMapping("aerolineas")
    public List<Aerolinea> getAerolineas() {
        return repositoryAerolinea.findAll();
    }

    // Guardar
    @PostMapping("guardarAerolinea")
    public String post(@RequestBody Aerolinea aerolinea) {
        repositoryAerolinea.save(aerolinea);
        return "AEROLINEA GUARDADA";
    }

    // Editar
    @PutMapping("editarAerolinea/{id}")
    public String uptdate(@PathVariable Integer id, @RequestBody Aerolinea aerolinea) {
        Aerolinea uptdateAerolinea = repositoryAerolinea.findById(id).get();
        uptdateAerolinea.setNombreAerolinea(aerolinea.getNombreAerolinea());
        repositoryAerolinea.save(uptdateAerolinea);

        return "AEROLINEA EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("deleteAerolinea/{id}")
    public String delete(@PathVariable Integer id) {
        Aerolinea deleteAerolinea = repositoryAerolinea.findById(id).get();
        repositoryAerolinea.delete(deleteAerolinea);

        return "AEROLINEA ELIMINADA";
    }
}
