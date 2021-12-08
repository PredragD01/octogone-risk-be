package com.octagone.risk.risk.repositories;

import com.octagone.risk.risk.entities.Pais;

import java.util.List;

public interface CountryRepository {

    List<Pais> getCountries();
}
