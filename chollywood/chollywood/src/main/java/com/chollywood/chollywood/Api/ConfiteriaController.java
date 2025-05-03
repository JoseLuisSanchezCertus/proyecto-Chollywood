package com.chollywood.chollywood.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.chollywood.chollywood.model.Confiteria;
import com.chollywood.chollywood.repository.ConfiteriaRepository;

import java.util.List;

@RestController
@RequestMapping("/confiteria")
public class ConfiteriaController {

    @Autowired
    private ConfiteriaRepository repo;

    @GetMapping
    public List<Confiteria> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Confiteria guardar(@RequestBody Confiteria confiteria) {
        return repo.save(confiteria);
    }
}