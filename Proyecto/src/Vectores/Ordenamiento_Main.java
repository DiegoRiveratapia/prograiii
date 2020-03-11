package Vectores;

import Empresa.Empleado;

import java.util.Scanner;
import java.util.Vector;

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
