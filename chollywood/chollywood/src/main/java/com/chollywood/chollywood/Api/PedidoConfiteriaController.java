package com.chollywood.chollywood.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.chollywood.chollywood.model.PedidoConfiteria;
import com.chollywood.chollywood.repository.PedidoConfiteriaRepository;

import java.util.List;

@RestController
@RequestMapping("/pedidoConfiteria")
public class PedidoConfiteriaController {

    @Autowired
    private PedidoConfiteriaRepository repo;

    @GetMapping
    public List<PedidoConfiteria> listar() {
        return repo.findAll();
    }

    @PostMapping
    public PedidoConfiteria guardar(@RequestBody PedidoConfiteria pedidoConfiteria) {
        return repo.save(pedidoConfiteria);
    }
}