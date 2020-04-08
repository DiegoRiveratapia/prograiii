package Tarea.EJERCICIOS;

import Tarea.EJERCICIOS.Ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t Ejercicios");
        System.out.println("SerieFibonacci");
        System.out.println("MetodosdeOrdenamiento");
        System.out.println("Cadenaiguala10");
        System.out.println("Crearunarraycon10elementosenteros");
        System.out.println("Ingrese el metodo a ejecutar");
        Scanner escribir = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();
        boolean salir = true;
        String Metodo;

        while(salir) {
            Metodo = escribir.next();

            switch (Metodo) {
                case "SerieFibonacci":
                    System.out.println("Ingrese la cantidad de elementos de la serie Fibonacci: ");
                    int n = leer.nextInt();
                    ejercicios.serieFibonacci(n);
                    System.out.println("\nIngrese el metodo a ejecutar");
                    break;
                case "MetodosdeOrdenamiento":
                    ejercicios.leerVector();
                    ejercicios.metburbuja();
                    ejercicios.metseleccion();
                    System.out.println("Ingrese el metodo a ejecutar");
                    break;
                case "Cadenaiguala10":
                    ejercicios.metwhile();
                    System.out.println("Metodo finalizado");
                    System.out.println("Ingrese el metodo a ejecutar");

                    break;
                case"Crearunarraycon10elementosenteros":
                    ejercicios.leerVector();
                    ejercicios.vectorespar();
                    break;
                default:
                    System.out.println("Metodo no valido");
                    salir = false;

            }
        }
    }

}
