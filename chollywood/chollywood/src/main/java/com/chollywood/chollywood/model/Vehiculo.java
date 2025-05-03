package com.chollywood.chollywood.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patente;
    private String modelo;
    private String color;
    private String nombreCliente;

    @OneToMany(mappedBy = "vehiculo")
    @JsonManagedReference("vehiculo-tickets")
    private List<Ticket> tickets;

    // Constructor
    public Vehiculo() {}

    public Vehiculo(Long id, String patente, String modelo, String color, String nombreCliente) {
        this.id = id;
        this.patente = patente;
        this.modelo = modelo;
        this.color = color;
        this.nombreCliente = nombreCliente;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    // toString
    @Override
    public String toString() {
        return "Vehiculo{" +
               "id=" + id +
               ", patente='" + patente + '\'' +
               ", modelo='" + modelo + '\'' +
               ", color='" + color + '\'' +
               ", nombreCliente='" + nombreCliente + '\'' +
               '}';
    }
}