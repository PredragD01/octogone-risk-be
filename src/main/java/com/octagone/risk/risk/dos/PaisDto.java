package com.octagone.risk.risk.dos;



/*
    Created by: Predrag
    Date: 04.11.2021
*/

public class PaisDto {

    private Long id;

    private String codigo;

    private String nombrePais;

    private Long valorRiesgo;

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
