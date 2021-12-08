package com.octagone.risk.risk.service.impl;

import com.octagone.risk.risk.dos.PaisDto;
import com.octagone.risk.risk.entities.Pais;
import com.octagone.risk.risk.mappers.CountryMapper;
import com.octagone.risk.risk.repositories.CountryRepository;
import com.octagone.risk.risk.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
    Created by: Predrag
    Date: 14.11.2021
*/

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public List<PaisDto> getCountries() {
        List<Pais> countries =  countryRepository.getCountries();
        List<PaisDto> countriesDto = new ArrayList<>();
        for(Pais p : countries){
            countriesDto.add(countryMapper.toDto(p));
        }
        return countriesDto;
    }
}
