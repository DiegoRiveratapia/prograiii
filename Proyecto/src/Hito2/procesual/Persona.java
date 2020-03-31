package Hito2.procesual;

public class Persona extends Ciudadano {
    public String etaoaCrecimiento;

    public Persona() {
        this.etaoaCrecimiento = "";
    }
    public void Leer(){
        super.Leer();

        System.out.printf("Ingrese Etapa de Crecimiento: ");
        etaoaCrecimiento = LEER.next();


    }
    public void Mostrar(){
        super.Mostrar();
        System.out.println("\t");
        System.out.printf("Etapa de Crecimiento: %s",this.etaoaCrecimiento);
    }

}
