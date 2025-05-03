package com.chollywood.chollywood.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.chollywood.chollywood.model.Vehiculo;
import com.chollywood.chollywood.repository.VehiculoRepository;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoRepository repo;

    @GetMapping
    public List<Vehiculo> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Vehiculo guardar(@RequestBody Vehiculo vehiculo) {
        return repo.save(vehiculo);
    }
}