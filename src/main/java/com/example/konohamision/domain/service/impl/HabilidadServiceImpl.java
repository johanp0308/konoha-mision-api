package com.example.konohamision.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.konohamision.domain.repository.HabilidadRepository;
import com.example.konohamision.domain.service.HabilidadService;
import com.example.konohamision.persistence.entity.HabilidadEntity;

public class HabilidadServiceImpl implements HabilidadService{

    private final HabilidadRepository habilidadRepository;

    @Autowired
    public HabilidadServiceImpl(HabilidadRepository habilidadRepository){
        this.habilidadRepository = habilidadRepository;
    }


    @Override
    public List<HabilidadEntity> getAll() {
        return habilidadRepository.findAll();
    }

    @Override
    public HabilidadEntity getById(Long id) {
        return habilidadRepository.findById(id).orElse(null);
    }

    @Override
    public HabilidadEntity saveHabilidad(HabilidadEntity habilidadEntity) {
        return habilidadRepository.save(habilidadEntity);
    }

    @Override
    public void deleteById(Long id) {
        habilidadRepository.deleteById(id);
    }
    
}
