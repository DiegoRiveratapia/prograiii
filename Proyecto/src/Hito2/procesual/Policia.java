package Hito2.procesual;

import java.util.Arrays;
import java.util.Scanner;

public class Policia extends Persona {
    public String turno;
    public int nroDestinos;
    public String destinos[];

    public Policia(){
        this.turno = "";
        this.nroDestinos = 0;
        this.leerVectorPol();
    }

    public void leerVectorPol() {
        System.out.println("Ingrese Cantidad de Destinos");
        int n = LEER.nextInt();
        destinos = new String[n];

        for (int i =0;i<n;i++){
            System.out.printf("Ingrese los destinos de los arreglos %s\n",i);
            String desleido= LEER.nextLine();
            destinos[i]= desleido;
        }
    }
    public void Leerpol(){
        super.Leer();

        System.out.printf("Ingrese turno: ");
        turno = LEER.next();
        System.out.printf("Ingrese Numero de Destinos: ");
        nroDestinos = LEER.nextInt();
        System.out.printf("Ingrese turno: ");
        turno = LEER.next();
        leerVectorPol();


    }
    public void Leer(){
        super.Leer();

        System.out.printf("Ingrese turno: ");
        turno = LEER.next();
        System.out.printf("Ingrese Numero de Destinos: ");
        nroDestinos = LEER.nextInt();
        System.out.printf("Ingrese turno: ");
        turno = LEER.next();
        leerVectorPol();


    }
    public void Mostrarpol(){
        super.Mostrar();
        System.out.println("\t");
        System.out.printf("Turno: %s, Nro Destinos: %d, destinos %s",this.turno,this.nroDestinos, Arrays.toString(this.destinos));
    }

}
