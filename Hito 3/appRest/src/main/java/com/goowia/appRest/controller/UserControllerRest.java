package com.goowia.appRest.controller;

import com.goowia.appRest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
public class UserControllerRest {
    @Autowired
    private UserService userService;

    @GetMapping("/saludo")
    public String saludo(@RequestParam(value = "name", defaultValue = "World")String name){
        return  userService.getName(name);
    }

}
