package com.corona.virus.Services;

import org.springframework.stereotype.Service;

@Service
public class CoronaVirusService implements InterfaceCoronaVirusService {
    public String nombreDepartamento;
    public int casosConfirmados;
    public int casosSospechosos;

    @Override
    public void LEER() {
        System.out.println("nombre dept:");
        this.nombreDepartamento = READ.next();
        System.out.println("casos confirmados:");
        this.casosConfirmados = READ.nextInt();
        System.out.println("casos sospechosos:");
        this.casosSospechosos = READ.nextInt();
    }

    @Override
    public void Mostrar() {
        System.out.println(
                        "Dep: " + this.nombreDepartamento +
                        " C: " + this.casosConfirmados +
                        " cs: " + this.casosSospechosos
        );
    }
}