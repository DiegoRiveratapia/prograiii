package Manejointerfacez;

public class Circulo implements Figura {
    private double diametro;

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    public double area() {
        double radio = diametro/2;
        double res;
        return res=Pi* Math.pow(radio,2);
    }
}
