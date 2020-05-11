package com.Hito3.Procesual.Services;

import com.Hito3.Procesual.Model.VirusModel;
import com.Hito3.Procesual.Repo.VirusRepo;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VirusServices implements VirusServicesInterface {
    @Autowired
    private VirusRepo virusRepo;

    @Override
    public VirusModel save(VirusModel vModel) {
        return virusRepo.save(vModel);
    }
    @Override
    public VirusModel update(VirusModel vModel, Integer idPer) {
        Optional<VirusModel> person = virusRepo.findById(idPer);
        VirusModel vUpdate = null;
        if (person.isPresent()) {
            vUpdate = person.get();
            vUpdate.setNombreDep(vModel.getNombreDep());
            vUpdate.setCasosContagiados(vModel.getCasosContagiados());
            vUpdate.setCasosSospechosos(vModel.getCasosContagiados());
            vUpdate.setCasosRecuperados(vModel.getCasosRecuperados());
            virusRepo.save(vUpdate);

        }
        return vUpdate;
    }

    @Override
    public Integer delete(Integer idPer) {
        virusRepo.deleteById(idPer);
        return 1;
    }

    @Override
    public List<VirusModel> getAllDep() {
        List<VirusModel> virus = new ArrayList<VirusModel>();
        virusRepo.findAll().forEach(virus::add);
        return virus;
    }

    @Override
    public VirusModel getVirusByIdPer(Integer idPer) {
        Optional<VirusModel> virus = virusRepo.findById(idPer);
        VirusModel vModel = null;
        if (virus.isPresent()) {
            vModel = virus.get();
        }
        return vModel;
    }
}