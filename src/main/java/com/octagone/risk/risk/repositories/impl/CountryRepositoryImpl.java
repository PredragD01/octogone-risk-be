package com.octagone.risk.risk.repositories.impl;

/*
    Created by: Predrag
    Date: 14.11.2021
*/

import com.octagone.risk.risk.entities.Pais;
import com.octagone.risk.risk.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CountryRepositoryImpl implements CountryRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Pais> getCountries() {
        return entityManager.createNativeQuery("SELECT * FROM Pais", Pais.class).getResultList();
    }
}
