package com.chollywood.chollywood.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.chollywood.chollywood.model.DetallePedido;
import com.chollywood.chollywood.repository.DetallePedidoRepository;

import java.util.List;

@RestController
@RequestMapping("/detallePedido")
public class DetallePedidoController {

    @Autowired
    private DetallePedidoRepository repo;

    @GetMapping
    public List<DetallePedido> listar() {
        return repo.findAll();
    }

    @PostMapping
    public DetallePedido guardar(@RequestBody DetallePedido detallePedido) {
        return repo.save(detallePedido);
    }
}