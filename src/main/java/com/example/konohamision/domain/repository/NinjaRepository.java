package com.example.konohamision.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.konohamision.persistence.entity.NinjaEntity;

public interface NinjaRepository extends JpaRepository<NinjaEntity,Long>{
 
    /*
    * In this method I consult the ninjas with a Mission
    */
    // @Query("SELECT n.* FROM ninja n, mision_ninja mn WHERE mn.ninja_id = n.ninja_id;")
    // NinjaEntity findAllNinjaWMision();
}
