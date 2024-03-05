package com.example.konohamision.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.konohamision.persistence.entity.NinjaEntity;

public interface NinjaRepository extends JpaRepository<NinjaEntity,Long>{
    
    // @Query("SELECT * FROM ")
    // NinjaEntity findByNombreARango(String nombre, String rango);
}
