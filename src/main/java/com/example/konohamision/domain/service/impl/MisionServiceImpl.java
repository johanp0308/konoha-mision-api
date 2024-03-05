package com.example.konohamision.domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.konohamision.domain.repository.MisionRepository;
import com.example.konohamision.domain.service.MisionService;
import com.example.konohamision.persistence.entity.MisionEntity;

@Service
public class MisionServiceImpl implements MisionService{
    
    private final MisionRepository misionRepository;

    @Autowired
    public MisionServiceImpl(MisionRepository misionRepository){
        this.misionRepository = misionRepository;
    }

    @Override
    public List<MisionEntity> getAll() {
        return misionRepository.findAll();
    }

    @Override
    public MisionEntity getById(Long id) {
        return misionRepository.findById(id).orElse(null);
    }

    @Override
    public MisionEntity saveMision(MisionEntity misionEntity) {
        return misionRepository.save(misionEntity);
    }

    @Override
    public void deleteById(Long id) {
        misionRepository.deleteById(id);
    }

    @Override
    public MisionEntity updateMision(Long id, MisionEntity misionEntity) {
        Optional<MisionEntity> oMision = misionRepository.findById(id);

        if(oMision.isPresent()){
            MisionEntity mision = oMision.get();
            mision.setDescripcionMison(misionEntity.getDescripcionMison());
            mision.setRangoMision(misionEntity.getRangoMision());
            mision.setRecompensaMision(misionEntity.getRecompensaMision());
            return misionRepository.save(mision);
        }else{
            return misionRepository.save(misionEntity);
        }
    }


}
