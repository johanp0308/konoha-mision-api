package com.example.konohamision.domain.service;

import java.util.List;

import com.example.konohamision.persistence.entity.MisionNinjaEntity;


public interface MisionNinjaService {
    List<MisionNinjaEntity> getAll();
    MisionNinjaEntity getById(Long id);
    MisionNinjaEntity saveHabilidad(MisionNinjaEntity misionNinjaEntity);
    MisionNinjaEntity updateHablidad(Long id, MisionNinjaEntity misionNinjaEntity);
    void deleteById(Long id);
}
