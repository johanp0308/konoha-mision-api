package com.example.konohamision.domain.service;

import java.util.List;

import com.example.konohamision.persistence.entity.MisionEntity;



public interface MisionService {
    List<MisionEntity> getAll();
    MisionEntity getById(Long id);
    MisionEntity saveHabilidad(MisionEntity misionEntity);
    MisionEntity updateHabilidad(Long id, MisionEntity misionEntity);
    void deleteById(Long id);
}
