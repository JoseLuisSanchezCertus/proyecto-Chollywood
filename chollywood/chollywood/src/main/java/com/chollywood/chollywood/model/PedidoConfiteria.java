package com.chollywood.chollywood.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class PedidoConfiteria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fechaHora;

    @ManyToOne
    @JoinColumn(name = "id_ticket")
    @JsonBackReference("ticket-pedidos")
    private Ticket ticket;

    @OneToMany(mappedBy = "pedidoConfiteria")
    @JsonManagedReference("pedido-detalles")
    private List<DetallePedido> detalles;

    // Constructor
    public PedidoConfiteria() {
    }

    public PedidoConfiteria(Long id, String fechaHora, Ticket ticket) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.ticket = ticket;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // toString
    @Override
    public String toString() {
        return "PedidoConfiteria{" +
                "id=" + id +
                ", fechaHora='" + fechaHora + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}