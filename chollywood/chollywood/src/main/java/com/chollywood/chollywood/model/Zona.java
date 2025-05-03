package com.chollywood.chollywood.model;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Zona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int capacidad;
    private double precioBase;

    @OneToMany(mappedBy = "zona")
    @JsonManagedReference("zona-tickets")
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "zona")
    @JsonManagedReference("zona-funciones")
    private List<Funcion> funciones;

    // Constructor
    public Zona() {}

    public Zona(Long id, String nombre, int capacidad, double precioBase, List<Ticket> tickets) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precioBase = precioBase;
        this.tickets = tickets;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    // toString
    @Override
    public String toString() {
        return "Zona{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               ", capacidad=" + capacidad +
               ", precioBase=" + precioBase +
               '}';
    }
}