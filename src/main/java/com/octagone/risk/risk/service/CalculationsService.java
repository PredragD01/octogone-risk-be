package com.octagone.risk.risk.service;

import com.octagone.risk.risk.dos.PercentageDto;
import com.octagone.risk.risk.dos.UserDto;

import java.util.List;

public interface CalculationsService {

    double calcTypeOfCLient(List<PercentageDto> percentages, UserDto userDto, boolean externa);
    double calcNaturalJur(List<PercentageDto> percentages, UserDto userDto, boolean externa);
    double calculateCountryOrigin(List<PercentageDto> percentages, UserDto userDto, boolean externa);
    double calculateCountryNac(List<PercentageDto> percentages, UserDto userDto, boolean externa);
    double calculateCountryInc(List<PercentageDto> percentages, UserDto userDto, boolean externa);
    double calculateCountryRes(List<PercentageDto> percentages, UserDto userDto, boolean externa);
    double calculateOcupation(List<PercentageDto> percentages, UserDto userDto, boolean externa);
    double calculateNumberOfAnnualTransactions(List<PercentageDto> percentages, UserDto userDto, boolean externa);
    double calculateMontoOfAnnualTransactions(List<PercentageDto> percentages, UserDto userDto, boolean externa);
    double calculateEstimationEquity(List<PercentageDto> percentages, UserDto userDto, boolean externa);
    double calculateCanalDistribution(List<PercentageDto> percentages, UserDto userDto, boolean externa);
    double calculateProducts(List<PercentageDto> percentages, UserDto userDto, boolean externa);
    double calculateCountryOpera(List<PercentageDto> percentages, UserDto userDto, boolean externa);
}
