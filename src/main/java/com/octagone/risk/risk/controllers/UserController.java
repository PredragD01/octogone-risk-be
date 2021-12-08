package com.octagone.risk.risk.controllers;

/*
    Created by: Predrag
    Date: 04.11.2021
*/

import com.octagone.risk.risk.dos.UserDto;
import com.octagone.risk.risk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    List<UserDto> getUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/checkIfExternal", method = RequestMethod.GET)
    boolean checkIfExternal(@RequestParam(value = "custodio")String custodio){
        return userService.checkIfExternal(custodio);
    }

    @RequestMapping(value = "/checkIfCountryDefaultRisk", method = RequestMethod.POST)
    boolean checkIfCountryRiskDefault(@RequestBody UserDto userDto){
        return userService.countryDefaultRisk(userDto);
    }

}
