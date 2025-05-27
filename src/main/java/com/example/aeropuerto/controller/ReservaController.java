package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Reserva;
import com.example.aeropuerto.repository.RepositoryReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/reservas")
@CrossOrigin(origins = "http://localhost:8080")
public class ReservaController {

    @Autowired
    private RepositoryReserva repositoryReserva;

    // Obtener Reserva por ID
    @GetMapping("/reserva/{id}")
    public Reserva getReserva(@PathVariable Integer id) {
        return repositoryReserva.findById(id).get();
    }

    // Obtener todas las Reservas
    @GetMapping("/reservas")
    public List<Reserva> getReservas() {
        return repositoryReserva.findAll();
    }

    // Guardar
    @PostMapping("/guardarReserva")
    public String post(@RequestBody Reserva reserva) {
        repositoryReserva.save(reserva);
        return "RESERVA GUARDADO";
    }

    // Editar
    @PutMapping("/editarReserva/{id}")
    public String update(@PathVariable Integer id, @RequestBody Reserva reserva) {
        Reserva updateReserva = repositoryReserva.findById(id).get();
        // actualizar campos
        repositoryReserva.save(updateReserva);
        return "RESERVA EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deleteReserva/{id}")
    public String delete(@PathVariable Integer id) {
        Reserva deleteReserva = repositoryReserva.findById(id).get();
        repositoryReserva.delete(deleteReserva);
        return "RESERVA ELIMINADO";
    }
}