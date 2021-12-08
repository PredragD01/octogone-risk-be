package com.octagone.risk.risk.service.impl;

import com.octagone.risk.risk.dos.ActividadEconomicaDto;
import com.octagone.risk.risk.entities.ActividadEconomica;
import com.octagone.risk.risk.mappers.ActividadEconomicaMapper;
import com.octagone.risk.risk.repositories.ActividadEconomicaRepository;
import com.octagone.risk.risk.service.ActividadEconomicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
    Created by: Predrag
    Date: 14.11.2021
*/

@Service
public class ActividadEconomicaServiceImpl implements ActividadEconomicaService {

    @Autowired
    private ActividadEconomicaRepository actividadEconomicaRepository;

    @Autowired
    private ActividadEconomicaMapper actividadEconomicaMapper;

    @Override
    public List<ActividadEconomicaDto> getActividadEconomica() {
        List<ActividadEconomica> actividadEconomicas = actividadEconomicaRepository.getActividadEconomica();
        List<ActividadEconomicaDto> actividadEconomicaDtos = new ArrayList<>();
        for(ActividadEconomica ae : actividadEconomicas){
            actividadEconomicaDtos.add(actividadEconomicaMapper.toDto(ae));
        }
        return actividadEconomicaDtos;
    }
}
