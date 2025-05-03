package com.chollywood.chollywood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chollywood.chollywood.model.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

}