package com.chollywood.chollywood.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.chollywood.chollywood.model.Zona;
import com.chollywood.chollywood.repository.ZonaRepository;

import java.util.List;

@RestController
@RequestMapping("/zonas")
public class ZonaController {

    @Autowired
    private ZonaRepository repo;

    @GetMapping
    public List<Zona> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Zona guardar(@RequestBody Zona zona) {
        return repo.save(zona);
    }
}