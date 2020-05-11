package com.goowia.appRest.controller;

import com.goowia.appRest.model.PersonaModel;
import com.goowia.appRest.services.PersonaService;
import com.goowia.appRest.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/")
public class UserControllerRest {
    @Autowired
    private UserService userService;
    @Autowired
    private PersonaService personaService;
    private final String NAME_APP = "GooWia Solutions";

    @GetMapping("/nameApp")
    public String nameApp(){
        return NAME_APP;
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam(value = "name", defaultValue = "World")String name){
        return  userService.getName(name);
    }

    @PostMapping("/person")
    public ResponseEntity save(@RequestBody PersonaModel persona){
        try{
            return new ResponseEntity<>(personaService.save(persona), HttpStatus.CREATED);

        } catch (Exception e)
        {
            return new ResponseEntity<>(null ,HttpStatus.EXPECTATION_FAILED);
        }
    }
    @DeleteMapping("/persons/{idPer}")
    public ResponseEntity<String> delete(@PathVariable("idPer") Integer idPer) {
        try {
            personaService.delete(idPer);
            return new ResponseEntity<>("person successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
