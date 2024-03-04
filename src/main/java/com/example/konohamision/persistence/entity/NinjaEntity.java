package com.example.konohamision.persistence.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "ninja")
public class NinjaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ninja_id")
    private Long ninjaId;

    private String nombreNinja;
    private String rangoNinja;
    private String aldea;

    @ManyToMany(mappedBy = "ninja")
    private Set<HabilidadEntity> habilidades;

    @OneToMany(mappedBy = "ninja",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MisionNinjaEntity> misiones;

    

    public NinjaEntity() {
    }

    public NinjaEntity(Long ninjaId, String nombreNinja, String rangoNinja, String aldea, Set<HabilidadEntity> habilidades) {
        this.ninjaId = ninjaId;
        this.nombreNinja = nombreNinja;
        this.rangoNinja = rangoNinja;
        this.aldea = aldea;
        this.habilidades = habilidades;
    }

    public List<MisionNinjaEntity> getMisiones() {
        return misiones;
    }

    public void setMisiones(List<MisionNinjaEntity> misiones) {
        this.misiones = misiones;
    }

    public Long getNinjaId() {
        return this.ninjaId;
    }

    public void setNinjaId(Long ninjaId) {
        this.ninjaId = ninjaId;
    }

    public String getNombreNinja() {
        return this.nombreNinja;
    }

    public void setNombreNinja(String nombreNinja) {
        this.nombreNinja = nombreNinja;
    }

    public String getRangoNinja() {
        return this.rangoNinja;
    }

    public void setRangoNinja(String rangoNinja) {
        this.rangoNinja = rangoNinja;
    }

    public String getAldea() {
        return this.aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }

    public Set<HabilidadEntity> getHabilidades() {
        return this.habilidades;
    }

    public void setHabilidades(Set<HabilidadEntity> habilidades) {
        this.habilidades = habilidades;
    }

    public NinjaEntity ninjaId(Long ninjaId) {
        setNinjaId(ninjaId);
        return this;
    }

    public NinjaEntity nombreNinja(String nombreNinja) {
        setNombreNinja(nombreNinja);
        return this;
    }

    public NinjaEntity rangoNinja(String rangoNinja) {
        setRangoNinja(rangoNinja);
        return this;
    }

    public NinjaEntity aldea(String aldea) {
        setAldea(aldea);
        return this;
    }

    public NinjaEntity habilidades(Set<HabilidadEntity> habilidades) {
        setHabilidades(habilidades);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof NinjaEntity)) {
            return false;
        }
        NinjaEntity ninjaEntity = (NinjaEntity) o;
        return Objects.equals(ninjaId, ninjaEntity.ninjaId) && Objects.equals(nombreNinja, ninjaEntity.nombreNinja) && Objects.equals(rangoNinja, ninjaEntity.rangoNinja) && Objects.equals(aldea, ninjaEntity.aldea) && Objects.equals(habilidades, ninjaEntity.habilidades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ninjaId, nombreNinja, rangoNinja, aldea, habilidades);
    }

    @Override
    public String toString() {
        return "{" +
            " ninjaId='" + getNinjaId() + "'" +
            ", nombreNinja='" + getNombreNinja() + "'" +
            ", rangoNinja='" + getRangoNinja() + "'" +
            ", aldea='" + getAldea() + "'" +
            "}";
    }
    
    
}
