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


    @ManyToOne()
    @JoinColumn(name = "ninja_id")
    private NinjaEntity ninjaId;

    @ManyToOne()
    @JoinColumn(name = "mision_id")
    private MisionEntity misionId;

    private Date fechaInicio;
    private Date fechaFin;


    public MisionNinjaEntity() {
    }

    public MisionNinjaEntity(Long registroId, NinjaEntity ninjaId, MisionEntity misionId, Date fechaInicio, Date fechaFin) {
        this.registroId = registroId;
        this.ninjaId = ninjaId;
        this.misionId = misionId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getRegistroId() {
        return this.registroId;
    }

    public void setRegistroId(Long registroId) {
        this.registroId = registroId;
    }

    public NinjaEntity getNinjaId() {
        return this.ninjaId;
    }

    public void setNinjaId(NinjaEntity ninjaId) {
        this.ninjaId = ninjaId;
    }

    public MisionEntity getMisionId() {
        return this.misionId;
    }

    public void setMisionId(MisionEntity misionId) {
        this.misionId = misionId;
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

    public MisionNinjaEntity registroId(Long registroId) {
        setRegistroId(registroId);
        return this;
    }

    public MisionNinjaEntity ninjaId(NinjaEntity ninjaId) {
        setNinjaId(ninjaId);
        return this;
    }

    public MisionNinjaEntity misionId(MisionEntity misionId) {
        setMisionId(misionId);
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MisionNinjaEntity)) {
            return false;
        }
        MisionNinjaEntity misionNinjaEntity = (MisionNinjaEntity) o;
        return Objects.equals(registroId, misionNinjaEntity.registroId) && Objects.equals(ninjaId, misionNinjaEntity.ninjaId) && Objects.equals(misionId, misionNinjaEntity.misionId) && Objects.equals(fechaInicio, misionNinjaEntity.fechaInicio) && Objects.equals(fechaFin, misionNinjaEntity.fechaFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registroId, ninjaId, misionId, fechaInicio, fechaFin);
    }

    @Override
    public String toString() {
        return "{" +
            " registroId='" + getRegistroId() + "'" +
            ", ninjaId='" + getNinjaId() + "'" +
            ", misionId='" + getMisionId() + "'" +
            ", fechaInicio='" + getFechaInicio() + "'" +
            ", fechaFin='" + getFechaFin() + "'" +
            "}";
    }
    
}
