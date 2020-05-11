package com.Hito3.Procesual.Services;

import com.Hito3.Procesual.Model.VirusModel;

import java.util.List;

public interface VirusServicesInterface {
    public VirusModel save(VirusModel vModel);
    public VirusModel update(VirusModel vModel, Integer idCoronaVirus);
    public Integer delete(Integer idCoronaVirus);
    public List<VirusModel> getAllDep();
    public VirusModel getVirusByIdPer(Integer idCoronaVirus);
}
