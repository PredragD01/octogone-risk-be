package com.octagone.risk.risk.mappers;

import com.octagone.risk.risk.dos.ActividadEconomicaDto;
import com.octagone.risk.risk.entities.ActividadEconomica;

public interface ActividadEconomicaMapper {

    ActividadEconomica toEntity(ActividadEconomicaDto actividadEconomicaDto);
    ActividadEconomicaDto toDto(ActividadEconomica actividadEconomica);
}
