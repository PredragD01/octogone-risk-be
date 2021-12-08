package com.octagone.risk.risk.service.impl;

import com.octagone.risk.risk.dos.PercentageDto;
import com.octagone.risk.risk.dos.UserDto;
import com.octagone.risk.risk.enums.Custodio;
import com.octagone.risk.risk.enums.PercentagesEnums;
import com.octagone.risk.risk.enums.RiskValue;
import com.octagone.risk.risk.service.CalculationsService;
import com.octagone.risk.risk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    Created by: Predrag
    Date: 07.11.2021
*/

@Service
public class CalculationsServiceImpl implements CalculationsService {

    @Override
    public double calcTypeOfCLient(List<PercentageDto> percentages, UserDto userDto, boolean externa){
        double percent = getPercentage(percentages,PercentagesEnums.typeOfClient, userDto);
        RiskValue risk = null;
        risk = userDto.getTypeOfClient().getRiskValue();
        if(externa){
            risk = userDto.getTypeOfClient().getExterna_risk();
        }
        return (percent * 100 * risk.getValue());
    }

    @Override
    public double calcNaturalJur(List<PercentageDto> percentages, UserDto userDto, boolean externa){
        double percent = getPercentage(percentages,PercentagesEnums.naturalezaJuridica, userDto);
        RiskValue risk = null;
        risk = userDto.getNaturalezaJurdica().getRiskValue();
        if(externa){
            risk = userDto.getNaturalezaJurdica().getExterna_risk();
        }
        return percent * 100 * risk.getValue();
    }

    @Override
    public double calculateCountryOrigin(List<PercentageDto> percentages, UserDto userDto, boolean externa) {
        double percent =  getPercentage(percentages,PercentagesEnums.countryOrigin, userDto);
        return percent * 100 * userDto.getCountryOrigin().getValorRiesgo();
    }

    @Override
    public double calculateCountryNac(List<PercentageDto> percentages, UserDto userDto, boolean externa) {
        double percent =  getPercentage(percentages,PercentagesEnums.countryNat, userDto);
        return percent * 100 * userDto.getCountryOfNat().getValorRiesgo();
    }

    @Override
    public double calculateCountryOpera(List<PercentageDto> percentages, UserDto userDto, boolean externa) {
        double percent =  getPercentage(percentages,PercentagesEnums.countryOpera,userDto);
        return percent * 100 * userDto.getCountryOpera().getValorRiesgo();
    }

    @Override
    public double calculateCountryInc(List<PercentageDto> percentages, UserDto userDto, boolean externa) {
        double percent =  getPercentage(percentages,PercentagesEnums.countryInc, userDto);
        return percent * 100 * userDto.getCountryOfInc().getValorRiesgo();
    }

    @Override
    public double calculateCountryRes(List<PercentageDto> percentages, UserDto userDto, boolean externa) {
        double percent =  getPercentage(percentages,PercentagesEnums.countryRes, userDto);
        return percent * 100  * userDto.getCountryOfRes().getValorRiesgo();
    }

    @Override
    public double calculateOcupation(List<PercentageDto> percentages, UserDto userDto, boolean externa) {
        double percent =  getPercentage(percentages,PercentagesEnums.actividadEcoomica,userDto);
        return userDto.getEconomicAct().getValor_de_riesgo() * percent * 100;
    }

    @Override
    public double calculateNumberOfAnnualTransactions(List<PercentageDto> percentages, UserDto userDto, boolean externa) {
        double percent =  getPercentage(percentages,PercentagesEnums.numeroTransAnn,userDto);
        RiskValue risk = null;
        risk = userDto.getNumberOfYearTransactions().getRiskValue();
        if(externa){
            risk = userDto.getNumberOfYearTransactions().getExterna_risk();
        }
        return risk.getValue() * percent  * 100;
    }

    @Override
    public double calculateMontoOfAnnualTransactions(List<PercentageDto> percentages, UserDto userDto, boolean externa) {
        double percent =  getPercentage(percentages,PercentagesEnums.montoDeTrans,userDto);
        RiskValue risk = null;
        risk = userDto.getAnnualTransactionAmount().getRiskValue();
        if(externa){
            risk = userDto.getAnnualTransactionAmount().getExterna_risk();
        }
        return risk.getValue() * percent  * 100;
    }

    @Override
    public double calculateEstimationEquity(List<PercentageDto> percentages, UserDto userDto, boolean externa) {
        double percent =  getPercentage(percentages,PercentagesEnums.patrimonioEstimado,userDto);
        RiskValue risk = null;
        risk = userDto.getEstimatedEquity().getRiskValue();
        if(externa){
            risk = userDto.getEstimatedEquity().getExterna_risk();
        }
        return risk.getValue() * percent  * 100;

    }

    @Override
    public double calculateCanalDistribution(List<PercentageDto> percentages, UserDto userDto, boolean externa) {
        double percent =  getPercentage(percentages,PercentagesEnums.chanelOfDist,userDto);
        RiskValue risk = null;
        risk = userDto.getChanelDistribution().getRiskValue();
        if(externa){
            risk = userDto.getChanelDistribution().getExterna_risk();
        }
        return risk.getValue() * percent  * 100;

    }

    @Override
    public double calculateProducts(List<PercentageDto> percentages, UserDto userDto, boolean externa) {
        double percent =  getPercentage(percentages,PercentagesEnums.productos,userDto);
        RiskValue risk = null;
        risk = userDto.getProducts().getRiskValue();
        if(externa){
            risk = userDto.getProducts().getExterna_risk();
        }
        return risk.getValue() * percent  * 100;

    }

    //util
    private double getPercentage(List<PercentageDto> percentages, PercentagesEnums pe, UserDto userDto){
        for(PercentageDto pdto : percentages){
            if(pdto.getName().equals(pe)){
                if(userDto.getCustodio().equals("WHITE_LABEL")){
                    return pdto.getPercent() / 100.0;
                }else{
                    return pdto.getPercentCustodia() / 100.0;
                }
            }
        }
        return 0;
    }
}
