package Hito2.Tarea.Manejo_de_interfaces_practica_hito2;

public class Empleado implements LeerInteface {

    public String primerNombre;
    public String primerApellido;
    public int ciNumero;
    public String ciExtension;

    public void Leer(){
        //System.out.println("Ingrese numero de empleados");
        //int n = LEER.nextInt();
        //for(int i=0;i<n;i++) {

            System.out.printf("Ingrese Primer Nombre: ");
            primerNombre = LEER.next();
            System.out.printf("Ingrese Primer Apellido : ");
            primerApellido = LEER.next();
            System.out.printf("Ingrese Numero CI :");
            ciNumero = LEER.nextInt();
        System.out.printf("Ingrese Extension CI : ");
        ciExtension = LEER.next();

        //}

    }
    public void Mostrar(){

        System.out.printf("Nombre : %s, Apellido: %s, Numero CI: %d, Extension CI: %s ",this.primerNombre,this.primerApellido,this.ciNumero,this.ciExtension);
    }

}
