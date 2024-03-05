package com.example.konohamision.domain.service;

import java.util.List;

import com.example.konohamision.persistence.entity.HabilidadEntity;

public interface HabilidadService {
    List<HabilidadEntity> getAll();
    HabilidadEntity getById(Long id);
    HabilidadEntity saveHabilidad(HabilidadEntity habilidadEntity);
    HabilidadEntity updateHabilidadEntity(Long id, HabilidadEntity habilidadEntity);
    void deleteById(Long id);
}
