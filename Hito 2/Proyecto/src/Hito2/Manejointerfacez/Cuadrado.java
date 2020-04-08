package Hito2.Manejointerfacez;

public class Cuadrado implements Figura{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double area() {
        double respuesta =lado*lado;
        return respuesta;
    }
}
