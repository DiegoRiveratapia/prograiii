package Hito2.introduccion;

import java.util.Scanner;

public class Persona {
    public static void main(String [] arg){
        Scanner leer = new Scanner(System.in);

        //para leer cadenas
//        System.out.println("Ingrese su nombre");
//        String n1Nombre = leer.nextLine();
//        System.out.println("Ingrese su Apellido");
//        String miApellido = leer.nextLine();
//
//        System.out.printf("Su nombre completo es: %s %s",n1Nombre,miApellido); System.out.println();
//
//        System.out.println("Ingrese su edad:");
//        int miEdad = leer.nextInt();
//        System.out.printf("Su edad es: %d",miEdad);
//
//        //sumar las primero 5 edades
//        int sumaedad = 0;
//        int promedio = 0;
//        int cont =0;
//        System.out.println("Ingrese las edades:");
//        while(cont < 5) {
//
//            int miEdad1 =leer.nextInt();
//
//
//            sumaedad += miEdad1;
//            System.out.println("Ingrese las edades:");
//            cont++;
//
//        }
//        promedio = sumaedad/cont;
//        System.out.println("el promedio total es:"+ promedio);

        //manejo del if
//        int numero1 = 20;
//
//        if(numero1 % 2 ==0){
//            System.out.printf("El numero %d es par",numero1);
//        } else {
//            System.out.printf("El numero %d es Impar",numero1);
//        }
//        String name = "pragraiii";
//        if(name.equals("prograv")) {
//            System.out.printf("la cadena %s es igual",name);
//        }else{
//            System.out.printf("la cadena %s es distinto",name);
//        }
        //manejo del for
//        for (int i = 1;i<10;i++){
//            System.out.println(i);
//        }
        System.out.println("Ingrese su credito:");
       while(leer.hasNextInt()) {

           int credit_number = leer.nextInt();

           if (credit_number <= 50000) {
               System.out.println("El nuemro es Platinium");
           }
           else if (credit_number >= 10000) {
               System.out.println("El nuemro es GOLD");
           }
            else if (credit_number < 10000) {
               System.out.println("El nuemro es SILVER");
           } else {
               System.out.println("Error");
           }
           System.out.println("Ingrese su credito:");
       }
    }
}
