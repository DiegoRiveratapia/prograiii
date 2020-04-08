package Hito2.Tarea.Manejo_de_interfaces_practica_hito2;

public class Oficinista extends Empleado {
    public String codArea;
    public int sueldoBasico;


    public void Leer(){
        super.Leer();
        System.out.printf("Ingresar Codigo del Area: ");
        codArea = LEER.next();
        System.out.printf("Ingresar Sueldo Basico: ");
        sueldoBasico = LEER.nextInt();

    }
    public void MostrarOF(){
        super.Mostrar();
        System.out.printf("CodArea: %s,Sueldo Basico: %d",this.codArea,this.sueldoBasico);
    }
}
