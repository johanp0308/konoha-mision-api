package com.example.konohamision.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.konohamision.domain.service.HabilidadService;
import com.example.konohamision.persistence.entity.HabilidadEntity;




@RestController
@RequestMapping("/api/habilidad")
@CrossOrigin("*")
public class HabilidadController {

    private final HabilidadService habilidadService;

    @Autowired
    public HabilidadController(HabilidadService habilidadService){
        this.habilidadService = habilidadService;
    }

    @GetMapping("/")
    public List<HabilidadEntity> obtenerTodos() {
        return habilidadService.getAll();
    }

    @GetMapping("/{id}")
    public HabilidadEntity obtenerById(@PathVariable String id) {
        return habilidadService.getById(Long.valueOf(id));
    }

    @PostMapping("/")
    public HabilidadEntity postMethodName(@RequestBody HabilidadEntity mision) {
        return habilidadService.saveHabilidad(mision);
    }
    
    @PutMapping("/{id}")
    public HabilidadEntity putMethodName(@PathVariable String id, @RequestBody HabilidadEntity mision) {
        return habilidadService.updateHabilidadEntity(Long.valueOf(id), mision);
    }

    @DeleteMapping("/{id}")
    public void deleteMision(@PathVariable String id){
        habilidadService.deleteById(Long.valueOf(id));
    }
}
