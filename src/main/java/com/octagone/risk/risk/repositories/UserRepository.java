package com.octagone.risk.risk.repositories;

import com.octagone.risk.risk.entities.Pais;
import com.octagone.risk.risk.entities.User;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();
}
