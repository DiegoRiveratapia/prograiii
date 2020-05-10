package com.Hito3.Procesual.Model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Corona_Virus")
public class VirusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCoronaVirus;
    @Column(name = "nombre_Dep", length = 50, nullable = false)
    private String nombreDep;
    @Column(name = "Casos_Contagiados")
    private Integer casosContagiados;
    @Column(name = "Casos_Sospechosos")
    private Integer CasosSospechosos;
    @Column(name = "Casos_Recuperados")
    private Integer CasosRecuperados;

    public int getIdCoronaVirus() {
        return idCoronaVirus;
    }

    public void setIdCoronaVirus(int idCoronaVirus) {
        this.idCoronaVirus = idCoronaVirus;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public Integer getCasosContagiados() {
        return casosContagiados;
    }

    public void setCasosContagiados(Integer casosContagiados) {
        this.casosContagiados = casosContagiados;
    }

    public Integer getCasosSospechosos() {
        return CasosSospechosos;
    }

    public void setCasosSospechosos(Integer casosSospechosos) {
        CasosSospechosos = casosSospechosos;
    }

    public Integer getCasosRecuperados() {
        return CasosRecuperados;
    }

    public void setCasosRecuperados(Integer casosRecuperados) {
        CasosRecuperados = casosRecuperados;
    }
}
