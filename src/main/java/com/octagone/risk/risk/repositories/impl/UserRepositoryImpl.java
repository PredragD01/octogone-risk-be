package com.octagone.risk.risk.repositories.impl;

/*
    Created by: Predrag
    Date: 04.11.2021
*/

import com.octagone.risk.risk.entities.Pais;
import com.octagone.risk.risk.entities.User;
import com.octagone.risk.risk.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return entityManager.createNativeQuery("SELECT * FROM Users", User.class).getResultList();
    }


}
