package com.octagone.risk.risk.mappers.impl;

import com.octagone.risk.risk.dos.PercentageDto;
import com.octagone.risk.risk.entities.Percentages;
import com.octagone.risk.risk.mappers.PercentagesMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/*
    Created by: Predrag
    Date: 07.11.2021
*/

@Service
public class PercentageMapperImpl implements PercentagesMapper {
    @Override
    public Percentages toEntity(PercentageDto percentageDto) {
        if(percentageDto != null){
            Percentages percentages = new Percentages();
            BeanUtils.copyProperties(percentageDto,percentages);
            return percentages;
        }
        return null;
    }

    @Override
    public PercentageDto toDto(Percentages percentages) {
        if(percentages != null){
            PercentageDto percentageDto = new PercentageDto();
            BeanUtils.copyProperties(percentages,percentageDto);
            return percentageDto;
        }
        return null;
    }
}
