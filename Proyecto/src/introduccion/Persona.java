package introduccion;

import java.util.Scanner;

public class Persona {
    public static void main(String [] arg){
        Scanner leer = new Scanner(System.in);

        //para leer cadenas
        System.out.println("Ingrese su nombre");
        String n1Nombre = leer.nextLine();
        System.out.println("Ingrese su Apellido");
        String miApellido = leer.nextLine();

        System.out.printf("Su nombre completo es: %s %s",n1Nombre,miApellido); System.out.println();

        System.out.println("Ingrese su edad:");
        int miEdad = leer.nextInt();
        System.out.printf("Su edad es: %d",miEdad);

        //sumar las primero 5 edades
        int sumaedad = 0;
        int promedio = 0;
        int cont =0;
        System.out.println("Ingrese las edades:");
        while(cont < 5) {

            int miEdad1 =leer.nextInt();


            sumaedad += miEdad1;
            System.out.println("Ingrese las edades:");
            cont++;

        }
        promedio = sumaedad/cont;
        System.out.println("el promedio total es:"+ promedio);
    }
}
