package com.example.konohamision.persistence.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Objects;

import java.util.List;

@Entity
@Table(name = "mision")
public class MisionEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mision_id")
    private Long misionId;

    private String descripcionMison;
    private String rangoMision;
    private double recompensaMision;

    @OneToMany(mappedBy = "mision", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MisionNinjaEntity> misiones;


    public MisionEntity() {
    }

    public MisionEntity(Long misionId, String descripcionMison, String rangoMision, double recompensaMision) {
        this.misionId = misionId;
        this.descripcionMison = descripcionMison;
        this.rangoMision = rangoMision;
        this.recompensaMision = recompensaMision;
    }

    public Long getMisionId() {
        return this.misionId;
    }

    public void setMisionId(Long misionId) {
        this.misionId = misionId;
    }

    public String getDescripcionMison() {
        return this.descripcionMison;
    }

    public void setDescripcionMison(String descripcionMison) {
        this.descripcionMison = descripcionMison;
    }

    public String getRangoMision() {
        return this.rangoMision;
    }

    public void setRangoMision(String rangoMision) {
        this.rangoMision = rangoMision;
    }

    public double getRecompensaMision() {
        return this.recompensaMision;
    }

    public void setRecompensaMision(double recompensaMision) {
        this.recompensaMision = recompensaMision;
    }

    public MisionEntity misionId(Long misionId) {
        setMisionId(misionId);
        return this;
    }

    public MisionEntity descripcionMison(String descripcionMison) {
        setDescripcionMison(descripcionMison);
        return this;
    }

    public MisionEntity rangoMision(String rangoMision) {
        setRangoMision(rangoMision);
        return this;
    }

    public MisionEntity recompensaMision(double recompensaMision) {
        setRecompensaMision(recompensaMision);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MisionEntity)) {
            return false;
        }
        MisionEntity misionEntity = (MisionEntity) o;
        return Objects.equals(misionId, misionEntity.misionId) && Objects.equals(descripcionMison, misionEntity.descripcionMison) && Objects.equals(rangoMision, misionEntity.rangoMision) && recompensaMision == misionEntity.recompensaMision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(misionId, descripcionMison, rangoMision, recompensaMision);
    }

    @Override
    public String toString() {
        return "{" +
            " misionId='" + getMisionId() + "'" +
            ", descripcionMison='" + getDescripcionMison() + "'" +
            ", rangoMision='" + getRangoMision() + "'" +
            ", recompensaMision='" + getRecompensaMision() + "'" +
            "}";
    }
    
}
