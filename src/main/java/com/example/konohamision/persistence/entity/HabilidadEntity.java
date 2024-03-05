package com.example.konohamision.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "habilidad")
public class HabilidadEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "habilidad_id")
    private Long habilidaId;

    private String nombreHabilidad;
    private String descripcionHabilidad;

    @ManyToMany(mappedBy = "habilidades")
    private Set<NinjaEntity> ninjas;
    

    public HabilidadEntity() {
    }

    public HabilidadEntity(Long habilidaId, String nombreHabilidad, String descripcionHabilidad, Set<NinjaEntity> ninjas) {
        this.habilidaId = habilidaId;
        this.nombreHabilidad = nombreHabilidad;
        this.descripcionHabilidad = descripcionHabilidad;
        this.ninjas = ninjas;
    }

    public Long getHabilidaId() {
        return this.habilidaId;
    }

    public void setHabilidaId(Long habilidaId) {
        this.habilidaId = habilidaId;
    }

    public String getNombreHabilidad() {
        return this.nombreHabilidad;
    }

    public void setNombreHabilidad(String nombreHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
    }

    public String getDescripcionHabilidad() {
        return this.descripcionHabilidad;
    }

    public void setDescripcionHabilidad(String descripcionHabilidad) {
        this.descripcionHabilidad = descripcionHabilidad;
    }

    public Set<NinjaEntity> getNinjas() {
        return this.ninjas;
    }

    public void setNinjas(Set<NinjaEntity> ninjas) {
        this.ninjas = ninjas;
    }

    public HabilidadEntity habilidaId(Long habilidaId) {
        setHabilidaId(habilidaId);
        return this;
    }

    public HabilidadEntity nombreHabilidad(String nombreHabilidad) {
        setNombreHabilidad(nombreHabilidad);
        return this;
    }

    public HabilidadEntity descripcionHabilidad(String descripcionHabilidad) {
        setDescripcionHabilidad(descripcionHabilidad);
        return this;
    }

    public HabilidadEntity ninjas(Set<NinjaEntity> ninjas) {
        setNinjas(ninjas);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof HabilidadEntity)) {
            return false;
        }
        HabilidadEntity habilidadEntity = (HabilidadEntity) o;
        return Objects.equals(habilidaId, habilidadEntity.habilidaId) && Objects.equals(nombreHabilidad, habilidadEntity.nombreHabilidad) && Objects.equals(descripcionHabilidad, habilidadEntity.descripcionHabilidad) && Objects.equals(ninjas, habilidadEntity.ninjas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habilidaId, nombreHabilidad, descripcionHabilidad, ninjas);
    }

    @Override
    public String toString() {
        return "{" +
            " habilidaId='" + getHabilidaId() + "'" +
            ", nombreHabilidad='" + getNombreHabilidad() + "'" +
            ", descripcionHabilidad='" + getDescripcionHabilidad() + "'" +
            ", ninjas='" + getNinjas() + "'" +
            "}";
    }

}
