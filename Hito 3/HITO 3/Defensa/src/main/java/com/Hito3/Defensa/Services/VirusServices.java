package com.Hito3.Defensa.Services;

import com.Hito3.Defensa.Model.ModelCoronaVirusPaciente;
import com.Hito3.Defensa.Repo.VirusRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VirusServices implements VirusServicesInterface{
    @Autowired
    private VirusRepo virusRepo;

    @Override
    public ModelCoronaVirusPaciente save(ModelCoronaVirusPaciente vModel) {

            if (vModel.getEdad_paciente()<10)
            {
                vModel.setCategoria("NINO");


            } else if (vModel.getEdad_paciente()<20){

                vModel.setCategoria("ADOLECENTE");
            }
            else
            {
                vModel.setCategoria("Adulto");
            }
            vModel.setFullname(vModel.getNombre_paciente() +" - "+ vModel.getApellido_paciente());
            return virusRepo.save(vModel);

    }

    @Override
    public ModelCoronaVirusPaciente saveMayores(ModelCoronaVirusPaciente vModel) {
        if(vModel.getEdad_paciente()<70) {
            if (vModel.getEdad_paciente() < 10) {
                vModel.setCategoria("NINO");


            } else if (vModel.getEdad_paciente() < 20) {

                vModel.setCategoria("ADOLECENTE");
            } else {
                vModel.setCategoria("Adulto");
            }
            vModel.setFullname(vModel.getNombre_paciente() + " - " + vModel.getApellido_paciente());
            return virusRepo.save(vModel);
        }
        else{
            return null;
        }
    }

    @Override
    public ModelCoronaVirusPaciente update(ModelCoronaVirusPaciente vModel, Integer idPer) {
        Optional<ModelCoronaVirusPaciente> person = virusRepo.findById(idPer);
        ModelCoronaVirusPaciente vUpdate = null;
        if (person.isPresent()) {
            vUpdate = person.get();
            vUpdate.setNombre_dep(vModel.getNombre_dep());
            vUpdate.setNombre_paciente(vModel.getNombre_paciente());
            vUpdate.setApellido_paciente(vModel.getApellido_paciente());
            vUpdate.setEdad_paciente(vModel.getEdad_paciente());
            if (vModel.getEdad_paciente()<10)
            {
                vUpdate.setCategoria("NINO");


            } else if (vModel.getEdad_paciente()<20){

                vUpdate.setCategoria("ADOLECENTE");
            }
            else
            {
                vUpdate.setCategoria("Adulto");
            }
            vUpdate.setFullname(vModel.getNombre_paciente() +" - "+ vModel.getApellido_paciente());
            vUpdate.setCasoscontagiados(vModel.getCasoscontagiados());
            vUpdate.setCasosSospechosos(vModel.getCasosSospechosos());
            vUpdate.setCasosRecuperados(vModel.getCasosRecuperados());
            virusRepo.save(vUpdate);

        }
        return vUpdate;
    }

    @Override
    public Integer delete() {
        virusRepo.deleteAll();
        return 1;
    }

    @Override
    public List<ModelCoronaVirusPaciente> getAllDep() {
        List<ModelCoronaVirusPaciente> virus = new ArrayList<ModelCoronaVirusPaciente>();
        virusRepo.findAll().forEach(virus::add);
        return virus;
    }

    @Override
    public ModelCoronaVirusPaciente getVirusByIdPer(Integer idPer) {
        Optional<ModelCoronaVirusPaciente> virus = virusRepo.findById(idPer);
        ModelCoronaVirusPaciente vModel = null;
        if (virus.isPresent()) {
            vModel = virus.get();
        }
        return vModel;
    }
}
