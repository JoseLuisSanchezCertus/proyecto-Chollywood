package com.chollywood.chollywood.model;
import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String imagen = "1.png";
    private String titulo;
    private String genero;
    private int duracion;
    private String clasificacion;
    private String sinopsis;
    @Column(name = "urlImagen")
    private String urlImagen;

    @OneToMany(mappedBy = "pelicula")
    @JsonManagedReference("pelicula-funciones")
    private List<Funcion> funciones;
	
    public Pelicula() {}

    public Pelicula(Long id, String titulo, String genero, int duracion, String clasificacion, String sinopsis, String urlImagen, String imagen, List<Funcion> funciones) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.sinopsis = sinopsis;
        this.urlImagen = urlImagen;
        this.imagen = imagen;
        this.funciones = funciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getUrlImagen(){
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen){
        this.urlImagen = urlImagen;
    }
    
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
               "id=" + id +
               ", titulo='" + titulo + '\'' +
               ", genero='" + genero + '\'' +
               ", duracion=" + duracion + '\'' +
               ", clasificacion='" + clasificacion + '\'' +
               ", sinopsis='" + sinopsis + '\'' +
               ", imagen='" + imagen + '\'' +
               '}';
    }
}