package com.octagone.risk.risk.mappers.impl;

import com.octagone.risk.risk.dos.PaisDto;
import com.octagone.risk.risk.entities.Pais;
import com.octagone.risk.risk.mappers.CountryMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/*
    Created by: Predrag
    Date: 14.11.2021
*/

@Service
public class CountryMapperImpl implements CountryMapper {

    @Override
    public Pais toEntity(PaisDto paisDto) {
        if(paisDto != null){
            Pais pais = new Pais();
            BeanUtils.copyProperties(paisDto,pais);
            return pais;
        }
        return null;
    }

    @Override
    public PaisDto toDto(Pais pais) {
        if(pais != null){
            PaisDto paisDto = new PaisDto();
            BeanUtils.copyProperties(pais,paisDto);
            return paisDto;
        }
        return null;
    }
}
