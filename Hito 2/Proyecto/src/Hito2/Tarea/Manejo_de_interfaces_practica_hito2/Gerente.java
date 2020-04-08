package Hito2.Tarea.Manejo_de_interfaces_practica_hito2;

public class Gerente extends Empleado {

    public int nrold;
    public String codArea;
    public int sueldoBasico;


    public void Leer(){
        super.Leer();

        System.out.printf("Ingrese nro de ID: ");
        nrold = LEER.nextInt();
        System.out.printf("Ingrese Codigo de Area: ");
        codArea = LEER.next();
        System.out.printf("Ingrese Sueldo Basico: ");
        sueldoBasico = LEER.nextInt();

    }
    public void Mostrar(){
        super.Mostrar();
        System.out.println("\t");
        System.out.printf("nroID : %d, codArea: %s, sdoBasico: %d ",this.nrold,this.codArea,this.sueldoBasico);
    }

}
