package com.octagone.risk.risk.controllers;

/*
    Created by: Predrag
    Date: 07.11.2021
*/

import com.octagone.risk.risk.dos.UserDto;
import com.octagone.risk.risk.responses.ResponseCalculations;
import com.octagone.risk.risk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/calculations")
public class CalculationsController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/calculateRisk", method = RequestMethod.POST)
    public ResponseCalculations calculateUser(@RequestBody UserDto userDto){
        return userService.calculateUser(userDto);
    }

    @RequestMapping(value = "/defaultHighRisk", method = RequestMethod.POST)
    public boolean highRisk(@RequestBody UserDto userDto){
        return userService.checkDefaultRisk(userDto);
    }
}
