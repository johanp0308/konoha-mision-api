package com.example.konohamision.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.konohamision.persistence.entity.NinjaEntity;

public interface NinjaRepository extends JpaRepository<NinjaEntity,Long>{
    
}
