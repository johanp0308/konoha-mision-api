package com.example.konohamision.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.konohamision.domain.service.MisionService;
import com.example.konohamision.persistence.entity.MisionEntity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api/mision")
@CrossOrigin("*")
public class MisionController {
    
    private final MisionService misionService;

    @Autowired
    public MisionController(MisionService misionService){
        this.misionService = misionService;
    }

    @GetMapping("/")
    public List<MisionEntity> obtenerTodos() {
        return misionService.getAll();
    }

    @GetMapping("/{id}")
    public MisionEntity obtenerById(@PathVariable String id) {
        return misionService.getById(Long.valueOf(id));
    }

    @PostMapping("/")
    public MisionEntity postMethodName(@RequestBody MisionEntity mision) {
        return misionService.saveMision(mision);
    }
    
    @PutMapping("/{id}")
    public MisionEntity putMethodName(@PathVariable String id, @RequestBody MisionEntity mision) {
        return misionService.updateMision(Long.valueOf(id), mision);
    }

    @DeleteMapping("/{id}")
    public void deleteMision(@PathVariable String id){
        misionService.deleteById(Long.valueOf(id));
    }
    
}
