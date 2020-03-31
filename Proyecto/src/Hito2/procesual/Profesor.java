package Hito2.procesual;

import java.util.Arrays;

public class Profesor extends Persona {
    public int cargaH;
    public String ciudad;
    public int nromaterias;
    public String[] Materias;

    public Profesor() {
        this.cargaH = 0;
        this.ciudad="";
        this.leerVectorProf();
    }


    public void leerVectorProf() {
        System.out.println("Ingrese Cantidad de Materias");
        int n = LEER.nextInt();
        Materias = new String[n];

        for (int i =0;i<n;i++){
            System.out.printf("Ingrese las Materias %s\n",i);
            String desleido= LEER.next();
            Materias[i]= desleido;
        }
    }

    public void Leerpro(){
        super.Leer();

        System.out.printf("Ingrese cargaH: ");
        cargaH = LEER.nextInt();
        System.out.printf("Ingrese ciudad: ");
        ciudad = LEER.next();
        leerVectorProf();

    }
    public void Mostrar(){
        super.Mostrar();
        System.out.println("\t");
        System.out.printf("CargaH: %d,ciudad: %s, nromaterias: %d,Materias: %s ",this.cargaH,this.ciudad,this.nromaterias, Arrays.toString(this.Materias));
    }

}
