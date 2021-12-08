package com.octagone.risk.risk.mappers;

import com.octagone.risk.risk.dos.*;
import com.octagone.risk.risk.entities.*;

/*
    Created by: Predrag
    Date: 04.11.2021
*/
public interface Mapper {

    UserDto toDto(User user);
    User toEntity(UserDto user);

    AnnualTransactionAmountDto annualTransactionAmountToDto(AnnualTransactionAmount annualTransactionAmount);
    AnnualTransactionAmount annualTransactionAmountToEntity(AnnualTransactionAmountDto annualTransactionAmountDto);

    ActividadEconomicaDto actividadEconomicaToDto(ActividadEconomica actividadEconomica);
    ActividadEconomica actividadEconomicaToEntity(ActividadEconomicaDto actividadEconomicaDto);

    ChanelDistributionDto chanalDistriburionToDto(ChanelDistribution chanelDistribution);
    ChanelDistribution chanalDistriburionToEntity(ChanelDistributionDto chanelDistributionDto);

    CriteriaRiskDto criteriaRiskToDto(CriteriaRisk criteriaRisk);
    CriteriaRisk criteriaRiskToEntity(CriteriaRiskDto criteriaRiskDto);

    EstimatedEquityDto estimatedEquityToDto(EstimatedEquity estimatedEquity);
    EstimatedEquity estimatedEquityToEntity(EstimatedEquityDto estimatedEquityDto);

    NaturalezaJurdicaDto naturToDto(NaturalezaJurdica naturalezaJurdica);
    NaturalezaJurdica naturToEntity(NaturalezaJurdicaDto naturalezaJurdicaDto);

    NumberOfYearTransactionsDto numberOfYearTransToDto(NumberOfYearTransactions numberOfYearTransactions);
    NumberOfYearTransactions numberOfYearTransToEntity(NumberOfYearTransactionsDto numberOfYearTransactionsDto);

    PaisDto paisToDto(Pais pais);
    Pais paisToEntity(PaisDto paisDto);

    ProductsDto productsToDto(Products products);
    Products productsToEntity(ProductsDto productsDto);

    TypeOfClientDto typeOfClientToDto(TypeOfClient typeOfClient);
    TypeOfClient typeOfClientToEntity(TypeOfClientDto typeOfClientDto);

    ZonaGraficaDto zonaGraficaToDto(ZonaGrafica zonaGrafica);
    ZonaGrafica zonaGraficaToEntity(ZonaGraficaDto zonaGraficaDto);


}
