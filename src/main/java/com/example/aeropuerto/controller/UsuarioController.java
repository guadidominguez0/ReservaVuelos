package com.example.aeropuerto.controller;

import com.example.aeropuerto.model.Usuario;
import com.example.aeropuerto.repository.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:8080")
public class UsuarioController {

    @Autowired
    private RepositoryUsuario repositoryUsuario;

    // Obtener Usuario por ID
    @GetMapping("/usuario/{id}")
    public Usuario getUsuario(@PathVariable Integer id) {
        return repositoryUsuario.findById(id).get();
    }

    // Obtener todas las Usuarios
    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return repositoryUsuario.findAll();
    }

    // Guardar
    @PostMapping("/guardarUsuario")
    public String post(@RequestBody Usuario usuario) {
        repositoryUsuario.save(usuario);
        return "USUARIO GUARDADO";
    }

    // Editar
    @PutMapping("/editarUsuario/{id}")
    public String update(@PathVariable Integer id, @RequestBody Usuario usuario) {
        Usuario updateUsuario = repositoryUsuario.findById(id).get();
        // actualizar campos
        repositoryUsuario.save(updateUsuario);
        return "USUARIO EDITADO CORRECTAMENTE";
    }

    // Eliminar
    @DeleteMapping("/deleteUsuario/{id}")
    public String delete(@PathVariable Integer id) {
        Usuario deleteUsuario = repositoryUsuario.findById(id).get();
        repositoryUsuario.delete(deleteUsuario);
        return "USUARIO ELIMINADO";
    }
}