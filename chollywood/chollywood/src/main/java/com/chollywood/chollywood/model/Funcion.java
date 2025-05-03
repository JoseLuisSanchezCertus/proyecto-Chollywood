package com.chollywood.chollywood.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class Funcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fecha;
    private String hora;

    @ManyToOne
    @JoinColumn(name = "id_pelicula")
    @JsonBackReference("pelicula-funciones")
    private Pelicula pelicula;

    @ManyToOne
    @JoinColumn(name = "id_zona")
    @JsonBackReference("zona-funciones")
    private Zona zona;

    @OneToMany(mappedBy = "funcion")
    private List<Ticket> tickets;

    // Constructor
    public Funcion() {}

    public Funcion(Long id, String fecha, String hora, Pelicula pelicula, Zona zona) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.pelicula = pelicula;
        this.zona = zona;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    // toString
    @Override
    public String toString() {
        return "Funcion{" +
               "id=" + id +
               ", fecha='" + fecha + '\'' +
               ", hora='" + hora + '\'' +
               ", pelicula=" + pelicula +
               ", zona=" + zona +
               '}';
    }
}