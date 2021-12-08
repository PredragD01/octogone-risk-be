package com.octagone.risk.risk.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
    Created by: Predrag
    Date: 04.11.2021
*/

@Entity
@Table(name = "pais")
public class Pais {
    @Id
    @Column
    private Long id;

    @Column
    private String codigo;

    @Column(name = "nombre_pais")
    private String nombrePais;

    @Column(name = "valor_de_riesgo")
    private Long valorRiesgo;

    @Column(name = "risk_default")
    private Boolean riskDefault;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Long getValorRiesgo() {
        return valorRiesgo;
    }

    public void setValorRiesgo(Long valorRiesgo) {
        this.valorRiesgo = valorRiesgo;
    }

    public Boolean getRiskDefault() {
        return riskDefault;
    }

    public void setRiskDefault(Boolean riskDefault) {
        this.riskDefault = riskDefault;
    }
}
