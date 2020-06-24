package Tarea.Manejo_de_interfaces_practica_hito2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t LEERINTERFACES");
        //System.out.println("Empleado");
        System.out.println("Gerente");
        System.out.println("Mensajero");
        System.out.println("Oficinista");
        System.out.println("Secretaria");
        System.out.println("Supervisor");
        System.out.println("Ingrese el empleado que dese ingresar");
        Scanner escribir = new Scanner(System.in);
       // Empleado emp = new Empleado();
        Gerente g1 = new Gerente();
        Mensajero men = new Mensajero();
        Oficinista of1 = new Oficinista();
        Secretaria sec = new Secretaria();
        Supervisor sup = new Supervisor();

        boolean salir = true;
        String Metodo;

        while (salir) {
            Metodo = escribir.next();

            switch (Metodo) {
                case "Gerente":
                    g1.Leer();
                    g1.Mostrar();
                    System.out.println("\nIngresado");
                    System.out.println("Ingresar empleado a ingresar");
                    break;
                case "Mensajero":
                    men.Leer();
                    men.Mostrar();
                    System.out.println("\nIngresado");
                    System.out.println("Ingresar empleado a ingresar");

                    break;
                case "Oficinista":
                    of1.Leer();
                    of1.MostrarOF();
                    System.out.println("\nIngresado");
                    System.out.println("Ingresar empleado a ingresar");
                    break;
                case "Secretaria":
                    sec.Leer();
                    sec.Mostrar();
                    System.out.println("\nIngresado");
                    System.out.println("Ingresar empleado a ingresar");

                    break;
                case "Supervisor":
                    sup.Leer();
                    sup.Mostrar();
                    System.out.println("\nIngresado");
                    System.out.println("Ingresar empleado a ingresar");
                    break;
                default:
                    System.out.println("\nEmpleado no valido");
                    salir = false;

            }
        }
    }
}
