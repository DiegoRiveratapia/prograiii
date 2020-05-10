package com.goowia.appRest.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "persona")
public class PersonaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPer;
    @Column(name = "nombres", length = 50, nullable = false)
    private String nombres;
    @Column(name = "apellidos", length = 50)
    private String apellidos;
    @Column(name = "email", length = 100)
    private String email;
    @Column(name = "fecNac")
    private Date fecNac;

    public Integer getIdPer() {
        return idPer;
    }

    public void setIdPer(Integer idPer) {
        this.idPer = idPer;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }
}
