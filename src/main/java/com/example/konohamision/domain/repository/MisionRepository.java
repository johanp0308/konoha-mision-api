package com.example.konohamision.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.konohamision.persistence.entity.MisionEntity;

public interface MisionRepository extends JpaRepository<MisionEntity,Long>{
    
}
