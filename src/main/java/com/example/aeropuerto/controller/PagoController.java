package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Pago;
import com.example.aeropuerto.repository.RepositoryPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pagos")
@CrossOrigin(origins = "http://localhost:8080")
public class PagoController {

    @Autowired
    private RepositoryPago repositoryPago;

    // Obtener Pago por ID
    @GetMapping("/pago/{id}")
    public Pago getPago(@PathVariable Integer id) {
        return repositoryPago.findById(id).get();
    }

    // Obtener todas las Pagos
    @GetMapping("/pagos")
    public List<Pago> getPagos() {
        return repositoryPago.findAll();
    }

    // Guardar
    @PostMapping("/guardarPago")
    public String post(@RequestBody Pago pago) {
        repositoryPago.save(pago);
        return "PAGO GUARDADO";
    }

    // Editar
    @PutMapping("/editarPago/{id}")
    public String update(@PathVariable Integer id, @RequestBody Pago pago) {
        Pago updatePago = repositoryPago.findById(id).get();
        // actualizar campos
        repositoryPago.save(updatePago);
        return "PAGO EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deletePago/{id}")
    public String delete(@PathVariable Integer id) {
        Pago deletePago = repositoryPago.findById(id).get();
        repositoryPago.delete(deletePago);
        return "PAGO ELIMINADO";
    }
}