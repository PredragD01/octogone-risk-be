package com.octagone.risk.risk.mappers.impl;

/*
    Created by: Predrag
    Date: 04.11.2021
*/

import com.octagone.risk.risk.dos.*;
import com.octagone.risk.risk.entities.*;
import com.octagone.risk.risk.mappers.Mapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserMapperImpl implements Mapper {


    @Override
    public UserDto toDto(User user) {
        if(user != null){
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(user,userDto);
            userDto.setAnnualTransactionAmount(annualTransactionAmountToDto(user.getAnnualTransactionAmount()));
            userDto.setChanelDistribution(chanalDistriburionToDto(user.getChanelDistribution()));
            userDto.setTypeOfClient(typeOfClientToDto(user.getTypeOfClient()));
            userDto.setCountryOfInc(paisToDto(user.getCountryOfInc()));
            userDto.setCountryOfNat(paisToDto(user.getCountryOfNat()));
            userDto.setCountryOfRes(paisToDto(user.getCountryOfRes()));
            userDto.setCountryOrigin(paisToDto(user.getCountryOrigin()));
            userDto.setCountryOpera(paisToDto(user.getCountryOpera()));
            userDto.setEconomicAct(actividadEconomicaToDto(user.getEconomicAct()));
            userDto.setEstimatedEquity(estimatedEquityToDto(user.getEstimatedEquity()));
            userDto.setNaturalezaJurdica(naturToDto(user.getNaturalezaJurdica()));
            userDto.setNumberOfYearTransactions(numberOfYearTransToDto(user.getNumberOfYearTransactions()));
            userDto.setProducts(productsToDto(user.getProducts()));
            return userDto;
        }
        return null;
    }

    @Override
    public User toEntity(UserDto userDto) {
        if(userDto != null){
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            return user;
        }
        return null;
    }

    //otherMappers


    @Override
    public AnnualTransactionAmountDto annualTransactionAmountToDto(AnnualTransactionAmount annualTransactionAmount) {
        if(annualTransactionAmount != null){
            AnnualTransactionAmountDto annualTransactionAmountDto = new AnnualTransactionAmountDto();
            BeanUtils.copyProperties(annualTransactionAmount,annualTransactionAmountDto);
            return annualTransactionAmountDto;
        }
        return null;
    }

    @Override
    public AnnualTransactionAmount annualTransactionAmountToEntity(AnnualTransactionAmountDto annualTransactionAmountDto) {
        if(annualTransactionAmountDto != null){
            AnnualTransactionAmount annualTransactionAmount = new AnnualTransactionAmount();
            BeanUtils.copyProperties(annualTransactionAmountDto,annualTransactionAmountDto);
            return annualTransactionAmount;
        }
        return null;
    }

    @Override
    public ActividadEconomicaDto actividadEconomicaToDto(ActividadEconomica actividadEconomica) {
        if(actividadEconomica != null){
            ActividadEconomicaDto actividadEconomicaDto = new ActividadEconomicaDto();
            BeanUtils.copyProperties(actividadEconomica,actividadEconomicaDto);
            return actividadEconomicaDto;
        }
        return null;
    }

    @Override
    public ActividadEconomica actividadEconomicaToEntity(ActividadEconomicaDto actividadEconomicaDto) {
        if(actividadEconomicaDto != null){
            ActividadEconomica actividadEconomica = new ActividadEconomica();
            BeanUtils.copyProperties(actividadEconomica,actividadEconomicaDto);
            return actividadEconomica;
        }
        return null;
    }

    @Override
    public ChanelDistributionDto chanalDistriburionToDto(ChanelDistribution chanelDistribution) {
        if(chanelDistribution != null){
            ChanelDistributionDto chanelDistributionDto = new ChanelDistributionDto();
            BeanUtils.copyProperties(chanelDistribution,chanelDistributionDto);
            return chanelDistributionDto;
        }
        return null;
    }

    @Override
    public ChanelDistribution chanalDistriburionToEntity(ChanelDistributionDto chanelDistributionDto) {
        if(chanelDistributionDto != null){
            ChanelDistribution chanelDistribution = new ChanelDistribution();
            BeanUtils.copyProperties(chanelDistributionDto,chanelDistribution);
            return chanelDistribution;
        }
        return null;
    }

    @Override
    public CriteriaRiskDto criteriaRiskToDto(CriteriaRisk criteriaRisk) {
        if(criteriaRisk != null){
            CriteriaRiskDto criteriaRiskDto = new CriteriaRiskDto();
            BeanUtils.copyProperties(criteriaRisk,criteriaRiskDto);
            return criteriaRiskDto;
        }
        return null;
    }

    @Override
    public CriteriaRisk criteriaRiskToEntity(CriteriaRiskDto criteriaRiskDto) {
        if(criteriaRiskDto != null){
            CriteriaRisk criteriaRisk = new CriteriaRisk();
            BeanUtils.copyProperties(criteriaRiskDto,criteriaRisk);
            return criteriaRisk;
        }
        return null;
    }

    @Override
    public EstimatedEquityDto estimatedEquityToDto(EstimatedEquity estimatedEquity) {
        if(estimatedEquity != null){
            EstimatedEquityDto estimatedEquityDto = new EstimatedEquityDto();
            BeanUtils.copyProperties(estimatedEquity,estimatedEquityDto);
            return estimatedEquityDto;
        }
        return null;
    }

    @Override
    public EstimatedEquity estimatedEquityToEntity(EstimatedEquityDto estimatedEquityDto) {
        if(estimatedEquityDto != null){
            EstimatedEquity estimatedEquity = new EstimatedEquity();
            BeanUtils.copyProperties(estimatedEquityDto,estimatedEquity);
            return estimatedEquity;
        }
        return null;
    }

    @Override
    public NaturalezaJurdicaDto naturToDto(NaturalezaJurdica naturalezaJurdica) {
        if(naturalezaJurdica != null){
            NaturalezaJurdicaDto naturalezaJurdicaDto = new NaturalezaJurdicaDto();
            BeanUtils.copyProperties(naturalezaJurdica,naturalezaJurdicaDto);
            return naturalezaJurdicaDto;
        }
        return null;
    }

    @Override
    public NaturalezaJurdica naturToEntity(NaturalezaJurdicaDto naturalezaJurdicaDto) {
        if(naturalezaJurdicaDto != null){
            NaturalezaJurdica naturalezaJurdica = new NaturalezaJurdica();
            BeanUtils.copyProperties(naturalezaJurdicaDto,naturalezaJurdica);
            return naturalezaJurdica;
        }
        return null;
    }

    @Override
    public NumberOfYearTransactionsDto numberOfYearTransToDto(NumberOfYearTransactions numberOfYearTransactions) {
        if(numberOfYearTransactions != null){
            NumberOfYearTransactionsDto numberOfYearTransactionsDto = new NumberOfYearTransactionsDto();
            BeanUtils.copyProperties(numberOfYearTransactions,numberOfYearTransactionsDto);
            return numberOfYearTransactionsDto;
        }
        return null;
    }

    @Override
    public NumberOfYearTransactions numberOfYearTransToEntity(NumberOfYearTransactionsDto numberOfYearTransactionsDto) {
        if(numberOfYearTransactionsDto != null){
            NumberOfYearTransactions numberOfYearTransactions = new NumberOfYearTransactions();
            BeanUtils.copyProperties(numberOfYearTransactionsDto,numberOfYearTransactions);
            return numberOfYearTransactions;
        }
        return null;
    }

    @Override
    public PaisDto paisToDto(Pais pais) {
        if(pais != null){
            PaisDto paisDto = new PaisDto();
            BeanUtils.copyProperties(pais,paisDto);
            return paisDto;
        }
        return null;
    }

    @Override
    public Pais paisToEntity(PaisDto paisDto) {
        if(paisDto != null){
            Pais pais = new Pais();
            BeanUtils.copyProperties(paisDto,pais);
            return pais;
        }
        return null;
    }

    @Override
    public ProductsDto productsToDto(Products products) {
        if(products != null){
            ProductsDto productsDto = new ProductsDto();
            BeanUtils.copyProperties(products,productsDto);
            return productsDto;
        }
        return null;
    }

    @Override
    public Products productsToEntity(ProductsDto productsDto) {
        if(productsDto != null){
            Products products = new Products();
            BeanUtils.copyProperties(productsDto,products);
            return products;
        }
        return null;
    }

    @Override
    public TypeOfClientDto typeOfClientToDto(TypeOfClient typeOfClient) {
        if(typeOfClient != null){
            TypeOfClientDto typeOfClientDto = new TypeOfClientDto();
            BeanUtils.copyProperties(typeOfClient,typeOfClientDto);
            return typeOfClientDto;
        }
        return null;
    }

    @Override
    public TypeOfClient typeOfClientToEntity(TypeOfClientDto typeOfClientDto) {
        if(typeOfClientDto != null){
            TypeOfClient typeOfClient = new TypeOfClient();
            BeanUtils.copyProperties(typeOfClientDto,typeOfClientDto);
            return typeOfClient;
        }
        return null;
    }

    @Override
    public ZonaGraficaDto zonaGraficaToDto(ZonaGrafica zonaGrafica) {
        if(zonaGrafica != null){
            ZonaGraficaDto zonaGraficaDto = new ZonaGraficaDto();
            BeanUtils.copyProperties(zonaGrafica,zonaGraficaDto);
            return zonaGraficaDto;
        }
        return null;
    }

    @Override
    public ZonaGrafica zonaGraficaToEntity(ZonaGraficaDto zonaGraficaDto) {
        if(zonaGraficaDto != null){
            ZonaGrafica zonaGrafica = new ZonaGrafica();
            BeanUtils.copyProperties(zonaGraficaDto,zonaGrafica);
            return zonaGrafica;
        }
        return null;
    }
}
