package com.octagone.risk.risk.enums;

/*
    Created by: Predrag
    Date: 04.11.2021
*/
public enum RiskValue {
    UNDEFINED(0), LOW(1), MEDIUM(2), HIGH(3);

    private final int value;

    RiskValue(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
