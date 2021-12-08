package com.octagone.risk.risk.controllers;

/*
    Created by: Predrag
    Date: 14.11.2021
*/

import com.octagone.risk.risk.dos.PaisDto;
import com.octagone.risk.risk.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping(value = "/getCountries", method = RequestMethod.GET)
    List<PaisDto> getCountries(){
        return countryService.getCountries();
    }
}
