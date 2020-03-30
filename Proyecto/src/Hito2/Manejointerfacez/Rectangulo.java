package Hito2.Manejointerfacez;

public class Rectangulo implements Figura {
    private float lado;
    private float altura;

    public Rectangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double area() {
        double res = lado*altura;
        return res;
    }
}
