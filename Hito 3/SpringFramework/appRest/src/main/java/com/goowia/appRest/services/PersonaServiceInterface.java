package com.goowia.appRest.services;

import java.util.List;
import com.goowia.appRest.model.PersonaModel;

public interface PersonaServiceInterface {
    public PersonaModel save(PersonaModel pModel);
    public PersonaModel update(PersonaModel pModel, Integer idPer);
    public Integer delete(Integer idPer);
    public List<PersonaModel> getAllPersons();
    public PersonaModel getPersonByIdPer(Integer idPer);
}