package Hito2.Manejointerfacez;

public class main {
    public static void main(String[] args){

        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println("Este es el tamaño del area: "+ cuadrado.area());

        Circulo circulo = new Circulo(5);
        System.out.println("Este es el tamaño del area: "+ circulo.area());

        Rectangulo rectangulo = new Rectangulo(5,10);
        System.out.println("Este es el tamaño del area: "+ rectangulo.area());



    }
}
