package com.example.konohamision.domain.service;

import java.util.List;

import com.example.konohamision.persistence.entity.NinjaEntity;

public interface NinjaService {
    List<NinjaEntity> getAll();
    NinjaEntity getById(Long id);
    NinjaEntity saveNinja(NinjaEntity ninjaEntity);
    NinjaEntity updateNinja(Long id, NinjaEntity ninjaEntity);
    void deleteById(Long id);
}
