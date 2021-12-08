package com.octagone.risk.risk.entities;

/*
    Created by: Predrag
    Date: 04.11.2021
*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zona_grafica")
public class ZonaGrafica {
    @Id
    private Long id;

    @Column
    private String name;

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
