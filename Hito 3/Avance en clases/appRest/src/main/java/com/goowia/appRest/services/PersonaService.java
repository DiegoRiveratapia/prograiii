package com.goowia.appRest.services;

import com.goowia.appRest.model.PersonaModel;
import com.goowia.appRest.repo.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PersonaService implements PersonaServiceInterface {
    @Autowired
    private PersonaRepo personaRepo;

    @Override
    public PersonaModel save(PersonaModel pModel) {
        return personaRepo.save(pModel);
    }

    @Override
    public PersonaModel update(PersonaModel pModel, Integer idPer) {
        Optional<PersonaModel> person = personaRepo.findById(idPer);
        PersonaModel personaUpdate = null;
        if (person.isPresent()) {
            personaUpdate = person.get();
            personaUpdate.setNombres(pModel.getNombres());
            personaUpdate.setApellidos(pModel.getApellidos());
            personaUpdate.setEmail(pModel.getEmail());
            personaUpdate.setFecNac(pModel.getFecNac());
            personaRepo.save(personaUpdate);
        }
        return personaUpdate;
    }

    @Override
    public Integer delete(Integer idPer) {
        personaRepo.deleteById(idPer);
        return 1;
    }

    @Override
    public List<PersonaModel> getAllPersons() {
        List<PersonaModel> persons = new ArrayList<PersonaModel>();
        personaRepo.findAll().forEach(persons::add);

        return persons;
    }

    @Override
    public PersonaModel getPersonByIdPer(Integer idPer) {
        Optional<PersonaModel> person = personaRepo.findById(idPer);
        PersonaModel pModel = null;

        if (person.isPresent()) {
            pModel = person.get();
        }
        return pModel;
    }
}