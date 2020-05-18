package com.Hito3.Defensa.Repo;

import com.Hito3.Defensa.Model.ModelCoronaVirusPaciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VirusRepo extends JpaRepository<ModelCoronaVirusPaciente,Integer> {

}
