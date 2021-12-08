package com.octagone.risk.risk.service.impl;

import com.octagone.risk.risk.dos.PercentageDto;
import com.octagone.risk.risk.dos.UserDto;
import com.octagone.risk.risk.entities.User;
import com.octagone.risk.risk.enums.Custodio;
import com.octagone.risk.risk.enums.RiskValue;
import com.octagone.risk.risk.mappers.Mapper;
import com.octagone.risk.risk.repositories.UserRepository;
import com.octagone.risk.risk.responses.ResponseCalculations;
import com.octagone.risk.risk.service.CalculationsService;
import com.octagone.risk.risk.service.PercentagesService;
import com.octagone.risk.risk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
    Created by: Predrag
    Date: 04.11.2021
*/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PercentagesService percentagesService;

    @Autowired
    private CalculationsService calculationsService;

    @Autowired
    private Mapper mapper;

    @Override
    public List<UserDto> getAllUsers() {

        List<User> usersEntity = new ArrayList<>();
        List<UserDto> userDtos = new ArrayList<>();
        usersEntity = userRepository.getAllUsers();
        for(User u : usersEntity){
            UserDto userDto = new UserDto();
            userDto = mapper.toDto(u);
            userDtos.add(userDto);
        }

        return userDtos;
    }



    @Override
    public ResponseCalculations calculateUser(UserDto userDto) {
        ResponseCalculations responseCalculations = new ResponseCalculations();
        if(checkDefaultRisk(userDto)){
            responseCalculations.setResult(RiskValue.HIGH.getValue());
            return responseCalculations;
        }

        List<PercentageDto> percentages = percentagesService.getPercentages();
        double total = 0.0;
        boolean external = checkIfExternal(userDto.getCustodio());
        total += calculationsService.calcTypeOfCLient(percentages,userDto,external);
        total += calculationsService.calcNaturalJur(percentages,userDto,external);
        total += calculationsService.calculateCountryOrigin(percentages,userDto,external);
        total += calculationsService.calculateCountryInc(percentages,userDto,external);
        total += calculationsService.calculateCountryNac(percentages,userDto,external);
        total += calculationsService.calculateCountryRes(percentages,userDto,external);
        total += calculationsService.calculateCountryOpera(percentages,userDto,external);
        total += calculationsService.calculateOcupation(percentages,userDto,external);
        total += calculationsService.calculateNumberOfAnnualTransactions(percentages,userDto,external);
        total += calculationsService.calculateMontoOfAnnualTransactions(percentages,userDto,external);
        total += calculationsService.calculateEstimationEquity(percentages,userDto,external);
        total += calculationsService.calculateCanalDistribution(percentages,userDto,external);
        total += calculationsService.calculateProducts(percentages,userDto,external);

        double finalCalc = total / 100.00;
        responseCalculations.setDetailedResult(finalCalc);

        if(finalCalc >= 1.30 && finalCalc <= 1.66){
            responseCalculations.setResult(RiskValue.LOW.getValue());
        }else if(finalCalc >= 1.67 && finalCalc <= 2.33){
            responseCalculations.setResult(RiskValue.MEDIUM.getValue());
        }else{
            responseCalculations.setResult(RiskValue.HIGH.getValue());
        }

        return responseCalculations;
    }

    @Override
    public boolean checkDefaultRisk(UserDto userDto){
        return userDto.getCliente_es_PEP() || userDto.getWorld_check() || userDto.getLista_ley() ||
                userDto.getProveedor() || userDto.getOng() || userDto.getRelated_shareholder() ||
                userDto.getCorrespondent() || userDto.getHigh_vol_operation() || userDto.getMoney_laund() ||
                userDto.getAdditional_act() || userDto.getSmv() ||

                userDto.getCountryOfRes().getRiskDefault() ||
                userDto.getCountryOfInc().getRiskDefault() || userDto.getCountryOfNat().getRiskDefault() ||
                userDto.getCountryOrigin().getRiskDefault() || userDto.getCountryOpera().getRiskDefault();
    }

    @Override
    public boolean countryDefaultRisk(UserDto userDto){
        return userDto.getCountryOfRes().getRiskDefault() ||
                userDto.getCountryOfInc().getRiskDefault() || userDto.getCountryOfNat().getRiskDefault() ||
                userDto.getCountryOrigin().getRiskDefault() || userDto.getCountryOpera().getRiskDefault();
    }

    @Override
    public boolean checkIfExternal(String custodio) {
        if(custodio.equals("WHITE_LABEL")){
            return false;
        }
        return true;
    }
}
