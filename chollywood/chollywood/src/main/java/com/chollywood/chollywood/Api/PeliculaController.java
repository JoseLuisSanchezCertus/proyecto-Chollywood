package com.chollywood.chollywood.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.chollywood.chollywood.model.Pelicula;
import com.chollywood.chollywood.repository.PeliculaRepository;

import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaRepository repo;

    @GetMapping
    public List<Pelicula> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Pelicula guardar(@RequestBody Pelicula pelicula) {
        return repo.save(pelicula);
    }
}