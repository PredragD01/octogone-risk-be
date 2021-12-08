package com.octagone.risk.risk.controllers;

/*
    Created by: Predrag
    Date: 08.12.2021
*/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testHeroku")
public class TestControllerHeroku {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    private String test(){
        return "ok si brale";
    }

}
