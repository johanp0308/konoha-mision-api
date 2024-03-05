package com.example.konohamision.domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.konohamision.domain.repository.NinjaRepository;
import com.example.konohamision.domain.service.NinjaService;
import com.example.konohamision.persistence.entity.NinjaEntity;

@Service
public class NinajServiceImpl implements NinjaService{

    private final NinjaRepository ninjaRepository;

    @Autowired
    public NinajServiceImpl(NinjaRepository ninjaRepository){
        this.ninjaRepository = ninjaRepository;
    }

    @Override
    public List<NinjaEntity> getAll() {
        return ninjaRepository.findAll();
    }

    @Override
    public NinjaEntity getById(Long id) {
        return ninjaRepository.findById(id).orElse(null);
    }

    @Override
    public NinjaEntity saveNinja(NinjaEntity ninjaEntity) {
        return ninjaRepository.save(ninjaEntity);
    }

    @Override
    public void deleteById(Long id) {
        ninjaRepository.deleteById(id);
    }

    @Override
    public NinjaEntity updateNinja(Long id, NinjaEntity ninjaEntity) {
        Optional<NinjaEntity> oNinja= Optional.of(ninjaRepository.findById(id).orElse(null));
        
        if(oNinja.isPresent()){
            NinjaEntity ninja = oNinja.get();
            ninja.setAldea(ninjaEntity.getAldea());
            ninja.setNombreNinja(ninjaEntity.getNombreNinja());
            ninja.setRangoNinja(ninjaEntity.getRangoNinja());
            return ninjaRepository.save(ninja);
        }else{
            return ninjaRepository.save(ninjaEntity);
        }
    }
    
    
}
