package Herencia;

public class Persona implements interfacePersona{
    public Persona() {

    }
//    public String nombres;
//    public String apellidos;
//    public int edad;
//    public String CI;


    public void getNombres() {
        System.out.printf("Pedrp %s",nombres);
    }
    public void getapellidos(){
        System.out.printf("Rivera %s",apellidos);
    }

    public void getEdad() {
        System.out.printf("88 %d",edad);
    }

    public void getCI(String ci) {
        System.out.printf("59225 %s",CI);
    }


    public void setCI(String ci) {
        System.out.printf("5992 %d",CI);
        
    }

    public Persona(String nombres, String apellidos, int edad, String CI){

//        interfacePersona.nombres;
//        interfacePersona.apellidos;
//        interfacePersona.edad;
//        interfacePersona.CI;
        getNombres();
        getapellidos();
        getEdad();
        getCI();
    }

    private void getCI() {
    }


}
