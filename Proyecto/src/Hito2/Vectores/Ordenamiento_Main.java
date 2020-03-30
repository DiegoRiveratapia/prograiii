package Hito2.Vectores;

public class Ordenamiento_Main {
    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        metodos.leerVector();

        metodos.metburbuja();
        System.out.println("\n");
        //metodos.mostrarVector();

        System.out.println("\n");
        metodos.metincercion();
        //metodos.mostrarVector();

        System.out.println("\n");
        metodos.metseleccion();
       // metodos.mostrarVector();
        System.out.println("\n");
    }
}
