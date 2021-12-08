package com.octagone.risk.risk.entities;

/*
    Created by: Predrag
    Date: 07.11.2021
*/

import com.octagone.risk.risk.enums.PercentagesEnums;

import javax.persistence.*;

@Entity
@Table(name="percentages")
public class Percentages {

    @Id
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private PercentagesEnums name;

    @Column
    private int percent;

    @Column
    private int percentCustodia;

    public int getPercentCustodia() {
        return percentCustodia;
    }

    public void setPercentCustodia(int percentCustodia) {
        this.percentCustodia = percentCustodia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PercentagesEnums getName() {
        return name;
    }

    public void setName(PercentagesEnums name) {
        this.name = name;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
