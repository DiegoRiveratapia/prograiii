package com.Hito3.Procesual.Controller;

import java.util.List;
import com.Hito3.Procesual.Model.VirusModel;
import com.Hito3.Procesual.Services.VirusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v2/")
public class UserControllerRest {
    @Autowired
    private VirusServices virusServices;

    @PostMapping("/virus")
    public ResponseEntity save(@RequestBody VirusModel persona){
        try{
            return new ResponseEntity<>(virusServices.save(persona), HttpStatus.CREATED);

        } catch (Exception e)
        {
            return new ResponseEntity<>(null ,HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/virus/{idCoronaVirus}")
    public ResponseEntity<VirusModel> updateVirus(@PathVariable("idCoronaVirus") Integer idCoronaVirus, @RequestBody VirusModel vModel) {
        try {
            VirusModel vUpdate = virusServices.update(vModel, idCoronaVirus);
            if (vUpdate != null) {
                return new ResponseEntity<>(vUpdate, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/virus")
    public ResponseEntity<List<VirusModel>> getAllDep() {
        try {
            List<VirusModel> persons = virusServices.getAllDep();

            if (persons.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(persons, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/virus/{idPer}")
    public ResponseEntity<VirusModel> getVirusByIdPer(@PathVariable("idPer") Integer idPer) {
        try {
            VirusModel vModel = virusServices.getVirusByIdPer(idPer);

            if (vModel != null) {
                return new ResponseEntity<>(vModel, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/virus/{idPer}")
    public ResponseEntity<String> delete(@PathVariable("idPer") Integer idPer) {
        try {
            virusServices.delete(idPer);
            return new ResponseEntity<>("Virus successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}