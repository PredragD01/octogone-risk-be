package com.octagone.risk.risk.mappers;

import com.octagone.risk.risk.dos.PercentageDto;
import com.octagone.risk.risk.entities.Percentages;

public interface PercentagesMapper {

    Percentages toEntity(PercentageDto percentageDto);
    PercentageDto toDto(Percentages percentages);
}
