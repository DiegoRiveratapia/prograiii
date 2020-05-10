package com.Hito3.Defensa.Model;


import javax.persistence.*;

@Entity
@Table(name = "corona_virus_paciente")
public class ModelCoronaVirusPaciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_corona_virus;
    @Column(name = "nombre_dep", length = 50, nullable = false)
    private String nombre_dep;

    @Column(name = "nombre_paciente", length = 50, nullable = false)
    private String nombre_paciente;

    @Column(name = "apellido_paciente", length = 50, nullable = false)
    private String apellido_paciente;

    @Column(name = "edad_paciente", length = 50, nullable = false)
    private Integer edad_paciente;

    @Column(name = "categoria", length = 50, nullable = false)
    private String categoria;

    @Column(name = "fullname", length = 50, nullable = false)
    private String fullname;

    @Column(name = "casos_contagiados")
    private Integer casoscontagiados;
    @Column(name = "casos_sospechosos")
    private Integer CasosSospechosos;
    @Column(name = "casos_recuperados")
    private Integer CasosRecuperados;

    public int getId_corona_virus() {
        return id_corona_virus;
    }

    public void setId_corona_virus(int id_corona_virus) {
        this.id_corona_virus = id_corona_virus;
    }

    public String getNombre_dep() {
        return nombre_dep;
    }

    public void setNombre_dep(String nombre_dep) {
        this.nombre_dep = nombre_dep;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public String getApellido_paciente() {
        return apellido_paciente;
    }

    public void setApellido_paciente(String apellido_paciente) {
        this.apellido_paciente = apellido_paciente;
    }

    public Integer getEdad_paciente() {
        return edad_paciente;
    }

    public void setEdad_paciente(Integer edad_paciente) {
        this.edad_paciente = edad_paciente;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getCasoscontagiados() {
        return casoscontagiados;
    }

    public void setCasoscontagiados(Integer casoscontagiados) {
        this.casoscontagiados = casoscontagiados;
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
