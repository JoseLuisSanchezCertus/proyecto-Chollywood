package com.chollywood.chollywood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chollywood.chollywood.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
}