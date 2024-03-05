package com.example.konohamision.persistence.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;


@Entity
@Table(name =  "mision_ninja")
public class MisionNinjaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registroId;
    
    private Date fechaInicio;
    private Date fechaFin;

    @ManyToOne()
    @JoinColumn(name = "ninja_id")
    private NinjaEntity ninja;

    @ManyToOne()
    @JoinColumn(name = "mision_id")
    private MisionEntity mision;



    public MisionNinjaEntity() {
    }

    public MisionNinjaEntity(Long registroId, Date fechaInicio, Date fechaFin, NinjaEntity ninja, MisionEntity mision) {
        this.registroId = registroId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ninja = ninja;
        this.mision = mision;
    }

    public Long getRegistroId() {
        return this.registroId;
    }

    public void setRegistroId(Long registroId) {
        this.registroId = registroId;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return this.fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public NinjaEntity getNinja() {
        return this.ninja;
    }

    public void setNinja(NinjaEntity ninja) {
        this.ninja = ninja;
    }

    public MisionEntity getMision() {
        return this.mision;
    }

    public void setMision(MisionEntity mision) {
        this.mision = mision;
    }

    public MisionNinjaEntity registroId(Long registroId) {
        setRegistroId(registroId);
        return this;
    }

    public MisionNinjaEntity fechaInicio(Date fechaInicio) {
        setFechaInicio(fechaInicio);
        return this;
    }

    public MisionNinjaEntity fechaFin(Date fechaFin) {
        setFechaFin(fechaFin);
        return this;
    }

    public MisionNinjaEntity ninja(NinjaEntity ninja) {
        setNinja(ninja);
        return this;
    }

    public MisionNinjaEntity mision(MisionEntity mision) {
        setMision(mision);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MisionNinjaEntity)) {
            return false;
        }
        MisionNinjaEntity misionNinjaEntity = (MisionNinjaEntity) o;
        return Objects.equals(registroId, misionNinjaEntity.registroId) && Objects.equals(fechaInicio, misionNinjaEntity.fechaInicio) && Objects.equals(fechaFin, misionNinjaEntity.fechaFin) && Objects.equals(ninja, misionNinjaEntity.ninja) && Objects.equals(mision, misionNinjaEntity.mision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registroId, fechaInicio, fechaFin, ninja, mision);
    }

    @Override
    public String toString() {
        return "{" +
            " registroId='" + getRegistroId() + "'" +
            ", fechaInicio='" + getFechaInicio() + "'" +
            ", fechaFin='" + getFechaFin() + "'" +
            ", ninja='" + getNinja().getNinjaId() + "'" +
            ", mision='" + getMision().getMisionId() + "'" +
            "}";
    }

}
