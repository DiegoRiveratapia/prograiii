package Hito2.Tarea.Manejo_de_interfaces_practica_hito2;

public class Mensajero extends Oficinista {
    public String turno;
    public void Leer() {
        super.Leer();
        System.out.printf("Ingrese Turno:  ");
        turno = LEER.next();
    }
    public void Mostrar(){
        super.MostrarOF();
        System.out.printf(", Nombre del Area: %s",this.turno);

    }
}
