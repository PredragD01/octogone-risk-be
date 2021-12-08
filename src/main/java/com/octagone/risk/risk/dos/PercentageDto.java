package com.octagone.risk.risk.dos;

import com.octagone.risk.risk.enums.PercentagesEnums;

/*
    Created by: Predrag
    Date: 07.11.2021
*/
public class PercentageDto {

    private Long id;

    private PercentagesEnums name;

    private int percent;

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
