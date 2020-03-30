package Hito2.Tarea.Manejo_de_interfaces_practica_hito2;

public class Supervisor extends Empleado {
    public int sueldo;
    public int antiguedad;

    public void Leer(){
        super.Leer();
        System.out.printf("Ingrese Sueldo: ");
        sueldo = LEER.nextInt();
        System.out.printf("Ingrese la Antiguedad : ");
        antiguedad = LEER.nextInt();
    }
    public void Mostrar(){
        super.Mostrar();
        System.out.printf("Sueldo: %d, Antiguedad: %d",this.sueldo,this.antiguedad);
    }
}
