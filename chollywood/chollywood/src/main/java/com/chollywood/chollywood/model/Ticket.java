package com.chollywood.chollywood.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double precioTotal;
    private String fechaCompra;

    @ManyToOne
    @JoinColumn(name = "id_funcion")
    private Funcion funcion;

    @ManyToOne
    @JoinColumn(name = "id_zona")
    @JsonBackReference("zona-tickets")
    private Zona zona;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo")
    @JsonBackReference("vehiculo-tickets")
    private Vehiculo vehiculo;

    @OneToMany(mappedBy = "ticket")
    @JsonManagedReference("ticket-pedidos")
    private List<PedidoConfiteria> pedidos;

    // Constructor
    public Ticket() {}

    public Ticket(Long id, double precioTotal, String fechaCompra, Funcion funcion, Zona zona, Vehiculo vehiculo) {
        this.id = id;
        this.precioTotal = precioTotal;
        this.fechaCompra = fechaCompra;
        this.funcion = funcion;
        this.zona = zona;
        this.vehiculo = vehiculo;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    // toString
    @Override
    public String toString() {
        return "Ticket{" +
               "id=" + id +
               ", precioTotal=" + precioTotal +
               ", fechaCompra='" + fechaCompra + '\'' +
               '}';
    }
}