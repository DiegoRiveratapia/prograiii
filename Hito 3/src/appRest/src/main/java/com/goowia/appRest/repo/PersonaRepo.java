package com.goowia.appRest.repo;

import com.goowia.appRest.model.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepo extends JpaRepository <PersonaModel,Integer> {
}
