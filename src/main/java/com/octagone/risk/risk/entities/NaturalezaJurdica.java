package com.octagone.risk.risk.entities;

import com.octagone.risk.risk.enums.RiskValue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
    Created by: Predrag
    Date: 04.11.2021
*/

@Entity
@Table(name = "naturaleza_jurdica")
public class NaturalezaJurdica {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private RiskValue externa_risk;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RiskValue getExterna_risk() {
        return externa_risk;
    }

    public void setExterna_risk(RiskValue externa_risk) {
        this.externa_risk = externa_risk;
    }
}
