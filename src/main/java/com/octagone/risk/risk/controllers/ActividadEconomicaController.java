package com.octagone.risk.risk.controllers;

/*
    Created by: Predrag
    Date: 14.11.2021
*/

import com.octagone.risk.risk.dos.ActividadEconomicaDto;
import com.octagone.risk.risk.service.ActividadEconomicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/actEconomica")
public class ActividadEconomicaController {

    @Autowired
    private ActividadEconomicaService actividadEconomicaService;

    @RequestMapping(value = "/getEconomica", method = RequestMethod.GET)
    private List<ActividadEconomicaDto> getActividad(){
        return actividadEconomicaService.getActividadEconomica();
    }
}
