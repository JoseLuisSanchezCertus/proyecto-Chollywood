package com.chollywood.chollywood.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class Confiteria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private double precio;
    private String urlImagen;

    @OneToMany(mappedBy = "confiteria")
    @JsonManagedReference("confiteria-detalles")
    private List<DetallePedido> detalles;

    // Constructor
    public Confiteria() {
    }

    public Confiteria(Long id, String nombre, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUrlImagen(){
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen){
        this.urlImagen = urlImagen;
    }

    // toString
    @Override
    public String toString() {
        return "Confiteria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }

}