package com.Hito3.Defensa.Controller;

import com.Hito3.Defensa.Model.ModelCoronaVirusPaciente;
import com.Hito3.Defensa.Services.VirusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v2/")
public class UserControllerRest {
    @Autowired
    private VirusServices virusServices;

    @PostMapping("/coronaVirusPaciente")
    public ResponseEntity save(@RequestBody ModelCoronaVirusPaciente persona){
        try{

            return new ResponseEntity<>(virusServices.save(persona), HttpStatus.CREATED);

        } catch (Exception e)
        {
            return new ResponseEntity<>(null ,HttpStatus.EXPECTATION_FAILED);
        }
    }
    @PostMapping("/coronaVirusPacienteMayor")
    public ResponseEntity saveMayores(@RequestBody ModelCoronaVirusPaciente persona2){
        try{
            return new ResponseEntity<>(virusServices.saveMayores(persona2), HttpStatus.EXPECTATION_FAILED);

        } catch (Exception e)
        {
            return new ResponseEntity<>(null ,HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/coronaVirusPaciente/{idCoronaVirus}")
    public ResponseEntity<ModelCoronaVirusPaciente> updateVirus(@PathVariable("idCoronaVirus") Integer idCoronaVirus,
                                                                @RequestBody ModelCoronaVirusPaciente vModel) {
        try {
            ModelCoronaVirusPaciente vUpdate = virusServices.update(vModel, idCoronaVirus);
            if (vUpdate != null) {
                return new ResponseEntity<>(vUpdate, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/coronaVirusPaciente")
    public ResponseEntity<List<ModelCoronaVirusPaciente>> getAllDep() {
        try {
            List<ModelCoronaVirusPaciente> persons = virusServices.getAllDep();

            if (persons.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(persons, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/coronaVirusPaciente")
    public ResponseEntity<String> delete() {
        try {
            virusServices.delete();
            return new ResponseEntity<>("ALL Virus successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/coronaVirusPaciente/{idPer}")
    public ResponseEntity<ModelCoronaVirusPaciente> getVirusByIdPer(@PathVariable("idPer") Integer idPer) {
        try {
            ModelCoronaVirusPaciente vModel = virusServices.getVirusByIdPer(idPer);

            if (vModel != null) {
                return new ResponseEntity<>(vModel, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
