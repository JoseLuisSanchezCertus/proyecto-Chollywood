package com.chollywood.chollywood.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.chollywood.chollywood.model.Ticket;
import com.chollywood.chollywood.repository.TicketRepository;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketRepository repo;

    @GetMapping
    public List<Ticket> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Ticket guardar(@RequestBody Ticket ticket) {
        return repo.save(ticket);
    }
}