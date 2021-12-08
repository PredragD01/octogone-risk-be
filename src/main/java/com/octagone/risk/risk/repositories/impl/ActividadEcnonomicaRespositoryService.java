package com.octagone.risk.risk.repositories.impl;

/*
    Created by: Predrag
    Date: 14.11.2021
*/

import com.octagone.risk.risk.entities.ActividadEconomica;
import com.octagone.risk.risk.repositories.ActividadEconomicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ActividadEcnonomicaRespositoryService implements ActividadEconomicaRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<ActividadEconomica> getActividadEconomica() {
        return entityManager.createNativeQuery("select * from activad_economica", ActividadEconomica.class).getResultList();
    }
}
