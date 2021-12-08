package com.octagone.risk.risk.dos;

/*
    Created by: Predrag
    Date: 04.11.2021
*/

import com.octagone.risk.risk.enums.RiskValue;

public class ChanelDistributionDto {

    private Long id;

    private String name;

    private RiskValue riskValue;

    private RiskValue externa_risk;

    public RiskValue getRiskValue() {
        return riskValue;
    }

    public void setRiskValue(RiskValue riskValue) {
        this.riskValue = riskValue;
    }

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
