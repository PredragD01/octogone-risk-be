package com.octagone.risk.risk.dos;

/*
    Created by: Predrag
    Date: 04.11.2021
*/


public class ActividadEconomicaDto {
     private Long id;

     private String codigo;

     private String nombre_actividad;

     private Long valor_de_riesgo;

     private Boolean alto_riesgo_automatico;


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

    public String getNombre_actividad() {
        return nombre_actividad;
    }

    public void setNombre_actividad(String nombre_actividad) {
        this.nombre_actividad = nombre_actividad;
    }

    public Long getValor_de_riesgo() {
        return valor_de_riesgo;
    }

    public void setValor_de_riesgo(Long valor_de_riesgo) {
        this.valor_de_riesgo = valor_de_riesgo;
    }

    public Boolean getAlto_riesgo_automatico() {
        return alto_riesgo_automatico;
    }

    public void setAlto_riesgo_automatico(Boolean alto_riesgo_automatico) {
        this.alto_riesgo_automatico = alto_riesgo_automatico;
    }
}
