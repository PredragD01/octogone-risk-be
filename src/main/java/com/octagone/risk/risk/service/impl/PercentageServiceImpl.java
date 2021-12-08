package com.octagone.risk.risk.service.impl;

import com.octagone.risk.risk.dos.PercentageDto;
import com.octagone.risk.risk.entities.Percentages;
import com.octagone.risk.risk.mappers.PercentagesMapper;
import com.octagone.risk.risk.repositories.PercentagesRepository;
import com.octagone.risk.risk.service.PercentagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
    Created by: Predrag
    Date: 07.11.2021
*/

@Service
public class PercentageServiceImpl implements PercentagesService {

    @Autowired
    private PercentagesRepository percentagesRepository;

    @Autowired
    private PercentagesMapper percentagesMapper;

    @Override
    public List<PercentageDto> getPercentages() {
        List<PercentageDto> percentageDtos = new ArrayList<>();
        List<Percentages> percentages = new ArrayList<>();
        percentages = percentagesRepository.getPercentages();
        for(Percentages p : percentages){
            percentageDtos.add(percentagesMapper.toDto(p));
        }
        return percentageDtos;
    }
}
