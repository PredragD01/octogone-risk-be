package com.octagone.risk.risk.repositories.impl;

import com.octagone.risk.risk.entities.Percentages;
import com.octagone.risk.risk.repositories.PercentagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

/*
    Created by: Predrag
    Date: 07.11.2021
*/

@Repository
public class PercentagesRepositoryImpl implements PercentagesRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Percentages> getPercentages() {
        return entityManager.createNativeQuery("SELECT * FROM percentages", Percentages.class).getResultList();
    }
}
