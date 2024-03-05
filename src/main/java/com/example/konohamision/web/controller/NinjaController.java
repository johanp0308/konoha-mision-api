package com.example.konohamision.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.konohamision.domain.service.NinjaService;
import com.example.konohamision.persistence.entity.MisionEntity;
import com.example.konohamision.persistence.entity.NinjaEntity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/ninja")
public class NinjaController {
    
    private final NinjaService ninjaService;

    @Autowired
    public NinjaController(NinjaService ninjaService){
        this.ninjaService = ninjaService;
    }

    @GetMapping("/")
    public List<NinjaEntity> getAll() {
        return ninjaService.getAll();
    }

    @GetMapping("/{id}")
    public NinjaEntity getById(@PathVariable String id) {
        return ninjaService.getById(Long.valueOf(id));
    }

    @PostMapping("/")
    public NinjaEntity addNinja(@RequestBody NinjaEntity ninja) {
        return ninjaService.saveNinja(ninja);
    }

    @PutMapping("/{id}")
    public NinjaEntity putMethodName(@PathVariable String id, @RequestBody NinjaEntity ninja) {
        return ninjaService.updateNinja(Long.valueOf(id),ninja);
    }
    
    @DeleteMapping("/{id}")
    public void deleteNinja(@PathVariable String id){
        ninjaService.deleteById(Long.valueOf(id));
    }
    
    
}
