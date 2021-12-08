package com.octagone.risk.risk.mappers;

import com.octagone.risk.risk.dos.PaisDto;
import com.octagone.risk.risk.entities.Pais;

public interface CountryMapper {
    PaisDto toDto(Pais pais);
    Pais toEntity(PaisDto pais);
}
