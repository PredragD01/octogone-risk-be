package com.octagone.risk.risk.responses;


import java.util.Date;

/*
    Created by: Predrag
    Date: 07.11.2021
*/
public class ResponseCalculations {
    private int result;
    private double detailedResult;
    private Date dateCalculated = new Date();

    public ResponseCalculations() {
    }

    public double getDetailedResult() {
        return detailedResult;
    }

    public void setDetailedResult(double detailedResult) {
        this.detailedResult = detailedResult;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Date getDateCalculated() {
        return dateCalculated;
    }

    public void setDateCalculated(Date dateCalculated) {
        this.dateCalculated = dateCalculated;
    }
}

