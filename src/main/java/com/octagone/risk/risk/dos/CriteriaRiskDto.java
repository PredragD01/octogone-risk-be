package com.octagone.risk.risk.dos;

/*
    Created by: Predrag
    Date: 04.11.2021
*/

import javax.persistence.Column;
import javax.persistence.Id;

public class CriteriaRiskDto {

    private Long id;

    private String codeName;

    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
