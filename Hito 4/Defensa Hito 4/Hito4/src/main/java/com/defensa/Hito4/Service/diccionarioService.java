package com.defensa.Hito4.Service;


import com.defensa.Hito4.Model.diccionarioModel;
import com.defensa.Hito4.Repository.diccionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class diccionarioService implements diccionarioServiceInterface {
    @Autowired
    private diccionarioRepository diccionarioRepo;

    @Override
    public void saveData() {
        if(diccionarioRepo.count()==0){
            diccionarioRepo.save(new diccionarioModel("MONDAY","SEGUNDA-FEIRA","LUNES"));
            diccionarioRepo.save(new diccionarioModel("TUESDAY","TERCA-FEIRA","MARTES"));
            diccionarioRepo.save(new diccionarioModel("WEDNESDAY","QUARTA-FEIRA","MIERCOLES"));
            diccionarioRepo.save(new diccionarioModel("THURSDAY","QUINTA-FEIRA","JUEVES"));
            diccionarioRepo.save(new diccionarioModel("FRIDAY","SEXTA-FEIRA","VIERNES"));
            diccionarioRepo.save(new diccionarioModel("SATURDAY","SABADO","SABADO"));
            diccionarioRepo.save(new diccionarioModel("SUNDAY","DOMINGO","DOMINGO"));
        }
    }
}
