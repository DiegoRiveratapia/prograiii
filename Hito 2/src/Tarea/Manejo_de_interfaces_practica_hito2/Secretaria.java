package Tarea.Manejo_de_interfaces_practica_hito2;

public class Secretaria extends Oficinista {
    public String nombreArea;

    public void Leer() {
        super.Leer();
        System.out.printf("Ingrese Nombre del Area: ");
        nombreArea = LEER.next();
    }
    public void Mostrar(){
        super.MostrarOF();
        System.out.printf(", Nombre del Area: %s",this.nombreArea);

    }
}
