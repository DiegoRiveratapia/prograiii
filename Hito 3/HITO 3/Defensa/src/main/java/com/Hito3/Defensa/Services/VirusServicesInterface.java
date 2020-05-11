package com.Hito3.Defensa.Services;

import com.Hito3.Defensa.Model.ModelCoronaVirusPaciente;

import java.util.List;

public interface VirusServicesInterface {
    public ModelCoronaVirusPaciente save(ModelCoronaVirusPaciente vModel);
    public ModelCoronaVirusPaciente saveMayores(ModelCoronaVirusPaciente vModel);
    public ModelCoronaVirusPaciente update(ModelCoronaVirusPaciente vModel, Integer idCoronaVirus);
    public Integer delete();
    public List<ModelCoronaVirusPaciente> getAllDep();
    public ModelCoronaVirusPaciente getVirusByIdPer(Integer idCoronaVirus);
}
