package com.chollywood.chollywood.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.chollywood.chollywood.model.Funcion;
import com.chollywood.chollywood.repository.FuncionRepository;

import java.util.List;

@RestController
@RequestMapping("/funciones")
public class FuncionController {

    @Autowired
    private FuncionRepository repo;

    @GetMapping
    public List<Funcion> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Funcion guardar(@RequestBody Funcion funcion) {
        return repo.save(funcion);
    }
}