package Hito2.Empresa;

public class Empleado {
    private String nombre;
    private String ci;
    private int edad;

    public Empleado(String nombre1,String ci1, int edad1){
        this.nombre = nombre1;
        this.ci =ci1;
        this.edad = edad1;

    }

    public void setNombre(String newName){
        this.nombre = newName;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void imprimir(){
        System.out.println("Nombre empleado: " + this.nombre);
        System.out.println("Ci empleado: " + this.ci);
        System.out.println("Edad empleado: " + this.edad);
    }

}
