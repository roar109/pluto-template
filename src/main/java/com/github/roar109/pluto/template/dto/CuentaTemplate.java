package com.github.roar109.pluto.template.dto;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by hector.mendoza on 07/07/2017.
 */
@Entity
@Table(name = "cuenta_template")
public class CuentaTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre_template")
    private String nombreTemplate;

    @Column(name = "concepto")
    private String concepto;

    @Column(name = "monto")
    private Double monto;

    @Column(name = "fecha_limite")
    private Date fechaLimite;

    @Column(name = "destino")
    private String destino;

    @Column(name = "entidad_id")
    private Integer entidad;

    @Column(name = "moneda_id")
    private Integer moneda;

    public CuentaTemplate(){}

    public CuentaTemplate(final CuentaTemplate source){
        this.concepto = source.getConcepto();
        this.destino = source.getDestino();
        this.entidad = source.getEntidad();
        this.fechaLimite = source.getFechaLimite();
        this.nombreTemplate = source.getNombreTemplate();
        this.moneda = source.getMoneda();
        this.monto = source.getMonto();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

      public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getEntidad() {
        return entidad;
    }

    public void setEntidad(Integer entidad) {
        this.entidad = entidad;
    }

    public Integer getMoneda() {
        return moneda;
    }

    public void setMoneda(Integer moneda) {
        this.moneda = moneda;
    }

    public String getNombreTemplate() {
        return nombreTemplate;
    }

    public void setNombreTemplate(String nombreTemplate) {
        this.nombreTemplate = nombreTemplate;
    }
}
