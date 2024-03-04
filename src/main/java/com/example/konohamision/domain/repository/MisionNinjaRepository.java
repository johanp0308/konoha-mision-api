package com.example.konohamision.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.konohamision.persistence.entity.MisionNinjaEntity;

public interface MisionNinjaRepository extends JpaRepository<MisionNinjaEntity,Long> {
    
}
