package com.goowia.appRest.services;

import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface{
    @Override
    public String getName(String name) {
        return "Mi primer Servicio REST by: " + name;
    }
}
