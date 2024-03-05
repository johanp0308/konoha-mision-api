package com.example.konohamision.domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.konohamision.domain.repository.MisionNinjaRepository;
import com.example.konohamision.domain.service.MisionNinjaService;
import com.example.konohamision.persistence.entity.MisionNinjaEntity;

@Service
public class MisionNinjaServiceImpl implements MisionNinjaService{

    private final MisionNinjaRepository misionNinjaRepository;

    @Autowired
    public MisionNinjaServiceImpl(MisionNinjaRepository misionNinjaRepository){
        this.misionNinjaRepository = misionNinjaRepository;
    }

    @Override
    public List<MisionNinjaEntity> getAll() {
        return misionNinjaRepository.findAll();
    }

    @Override
    public MisionNinjaEntity getById(Long id) {
        return misionNinjaRepository.findById(id).orElse(null);
    }

    @Override
    public MisionNinjaEntity saveHabilidad(MisionNinjaEntity misionNinjaEntity) {
        return misionNinjaRepository.save(misionNinjaEntity);
    }

    @Override
    public void deleteById(Long id) {
        misionNinjaRepository.deleteById(id);
    }

    @Override
    public MisionNinjaEntity updateHablidad(Long id, MisionNinjaEntity misionNinjaEntity) {
        Optional<MisionNinjaEntity> oMision = misionNinjaRepository.findById(id);

        if(oMision.isPresent()){
            MisionNinjaEntity mision = oMision.get();
            mision.setFechaFin(misionNinjaEntity.getFechaFin());
            mision.setFechaFin(misionNinjaEntity.getFechaFin());
            return misionNinjaRepository.save(mision);
        }else{
            return misionNinjaRepository.save(misionNinjaEntity);
        }
    }



    
}
