package com.defensa.Hito4.Service;


import com.defensa.Hito4.Model.diccionarioModel;
import com.defensa.Hito4.Repository.diccionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class diccionarioService implements diccionarioServiceInterface {
    @Autowired
    private diccionarioRepository dictionaryRepository;
    @Override
    public void saveData() {
        if (dictionaryRepository.count() == 0) {

            dictionaryRepository.save(new diccionarioModel("MONDAY", "SEGUNDA-FEIRA","LUNES"));
            dictionaryRepository.save(new diccionarioModel("TUESDAY","TERCA-FEIRA" ,"MARTES"));
            dictionaryRepository.save(new diccionarioModel("WEDNESDAY","QUARTA-FEIRA","MIERCOLES"));
            dictionaryRepository.save(new diccionarioModel("THURSDAY","QUINTA-FEIRA","JUEVES"));
            dictionaryRepository.save(new diccionarioModel("FRIDAY","SEXTA-FEIRA","VIERNES"));
            dictionaryRepository.save(new diccionarioModel("SATURDAY","SABADO","SABADO"));
            dictionaryRepository.save(new diccionarioModel("SUNDAY","DOMINGO","DOMINGO"));
        }
    }
    @Override
    public String traducir(String t, String l) {
        diccionarioModel dictionaryModel = dictionaryRepository.getWordTranslate(t);
        String ingles = dictionaryModel.getEnglish();
        String ln_i = "INGLES";
        String word = dictionaryModel.getWord();
        String ln_w = "ESPAÑOL";
        String portugues = dictionaryModel.getPortugues();
        String ln_p = "PORTUGUES";
        String traduccion = "";
        if(l.equals(ln_i)){
            traduccion = ingles;
        }
        if(l.equals(ln_w)){
            traduccion = word;
        }
        if(l.equals(ln_p)){
            traduccion = portugues;
        }
        return traduccion;
    }
}
