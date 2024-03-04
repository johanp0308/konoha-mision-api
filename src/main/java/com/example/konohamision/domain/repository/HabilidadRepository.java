package com.example.konohamision.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.konohamision.persistence.entity.HabilidadEntity;

public interface HabilidadRepository extends JpaRepository<HabilidadEntity,Long>{
    
}
