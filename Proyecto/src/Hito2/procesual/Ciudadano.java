package Hito2.procesual;

public class Ciudadano implements LeerInteface {
    public String primerNombre;
    public String primerApellido;
    public int ciNumber;
    public String ciExt;
    public int edad;

    public Ciudadano() {
        this.primerNombre = "";
        this.primerApellido =  "";
        this.ciNumber =  0;
        this.ciExt = "";
        this.edad =0;
    }

    public void Leer(){

        System.out.printf("Ingrese Primer Nombre: ");
        primerNombre = LEER.next();
        System.out.printf("Ingrese Primer Apellido : ");
        primerApellido = LEER.next();
        System.out.printf("Ingrese Numero CI :");
        ciNumber = LEER.nextInt();
        System.out.printf("Ingrese Extension CI : ");
        ciExt = LEER.next();
        System.out.printf("Ingrese Edad : ");
        edad = LEER.nextInt();

    }
    public void Mostrar(){

        System.out.printf("Nombre : %s, Apellido: %s, Numero CI: %d, Extension CI: %s ,Edad: %d ",this.primerNombre,this.primerApellido,this.ciNumber,this.ciExt,this.edad);
    }

}
