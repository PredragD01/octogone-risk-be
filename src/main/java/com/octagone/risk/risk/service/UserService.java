package com.octagone.risk.risk.service;

import com.octagone.risk.risk.dos.UserDto;
import com.octagone.risk.risk.responses.ResponseCalculations;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();
    ResponseCalculations calculateUser(UserDto userDto);
    boolean checkDefaultRisk(UserDto userDto);
    boolean checkIfExternal(String custodio);
    boolean countryDefaultRisk(UserDto userDto);
}
