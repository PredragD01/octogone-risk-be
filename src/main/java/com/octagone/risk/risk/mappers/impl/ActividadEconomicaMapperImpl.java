package com.octagone.risk.risk.mappers.impl;

/*
    Created by: Predrag
    Date: 14.11.2021
*/

import com.octagone.risk.risk.dos.ActividadEconomicaDto;
import com.octagone.risk.risk.entities.ActividadEconomica;
import com.octagone.risk.risk.mappers.ActividadEconomicaMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ActividadEconomicaMapperImpl implements ActividadEconomicaMapper {

    @Override
    public ActividadEconomica toEntity(ActividadEconomicaDto actividadEconomicaDto) {
        if(actividadEconomicaDto != null){
            ActividadEconomica actividadEconomica = new ActividadEconomica();
            BeanUtils.copyProperties(actividadEconomicaDto,actividadEconomica);
            return actividadEconomica;
        }
        return null;
    }

    @Override
    public ActividadEconomicaDto toDto(ActividadEconomica actividadEconomica) {
        if(actividadEconomica != null){
            ActividadEconomicaDto actividadEconomicaDto = new ActividadEconomicaDto();
            BeanUtils.copyProperties(actividadEconomica,actividadEconomicaDto);
            return actividadEconomicaDto;
        }
        return null;
    }
}
