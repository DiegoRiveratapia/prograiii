import introduccion.Ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Ingrese el metodo a ejecutar");
        Scanner escribir = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();
        boolean salir = true;
        String Metodo;

        while(salir) {
            Metodo = escribir.next();

            switch (Metodo) {
                case "SeriesNaturales":
                    ejercicios.seriesNaturales(20);
                    break;
                case "comparardoscadenas":

                    System.out.println("Ingrese la primera cadena");
                    String c1 = leer.nextLine();
                    System.out.println("Ingrese la segunda cadena");
                    String c2 = leer.nextLine();
                    ejercicios.compara2cadenas(c1, c2);
                    break;
                case "cadena":
                    ejercicios.cadena(15);
                    break;
                default:
                    System.out.println("metodo no valido");
                    salir = false;
            }
        }
    }

}
