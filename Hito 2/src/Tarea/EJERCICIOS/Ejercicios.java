package Hito2.Tarea.EJERCICIOS;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {
    //serieFibonacci
    public void serieFibonacci(int n){
        int cont = 0;
        int x  = 1;
        int aux = 0;
        while (cont<n){
            for(int i = 0;i<n;i++) {
                System.out.printf("%d,",cont);
                aux=cont+x;
                cont=x;
                x=aux;
            }
        }
    }
    //Metodos de ordenamiento
    private Integer vector[];
    private Scanner leervec;
    private Scanner leer;

    public Ejercicios(){
        leervec = new Scanner(System.in);
        leer = new Scanner(System.in);
    }
    public void leerVector() {
        System.out.println("Ingrese tamaño del arreglo");
        int n = leervec.nextInt();
        vector = new Integer[n];

        for (int i =0;i<n;i++){
            System.out.printf("Ingrese las posiciones de los arreglos %d\n",i);
            int numleido= leervec.nextInt();
            vector[i]= numleido;
        }
    }

    public void metburbuja() {
        int aux;
        //int[]  vector;
        for(int i=0;i < vector.length; i++){
            for(int j=i+1;j<vector.length;j++){
                if(vector[i] > vector[j]){
                    aux= vector[i];
                    vector[i]=vector[j];
                    vector[j]= aux;

                }
            }

        }
        System.out.println("Metodo de la burbuja: "+ Arrays.toString(vector));
    }
    public void metseleccion() {
        //int[]  vector = new int[]{55,66,44,11};

        for (int i = 0; i < vector.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < vector.length; j++){

                if (vector[j] < vector[min]){
                    min = j;
                }
            }
            if (i != min){
                int aux= vector[i];
                vector[i] = vector[min];
                vector[min] = aux;
            }
        }
        System.out.println("Metodo por Selección : " + Arrays.toString(vector));
    }
    //Leer cadenas con while y hasNext()

    public void metwhile() {

            System.out.println("Ingrese la cadena: ");
            while (leer.hasNextLine()){

                String cadena_tam = leer.nextLine();

                if (cadena_tam.length() == 10) {
                    System.out.println("Cadena Encontrada");
                    break;

                } else {
                    System.out.println("Error cadena no es de tamaño 10");
                }
                System.out.println("Ingrese otra cadena:");
            }

    }
    public void vectorespar(){
        int aux = 0;
        //int[]  vectoraux;
        for(int i=0;i < vector.length; i++){
                if(i % 2 == 0){
                    aux++;

                }
        }
        System.out.println("La cantidad de numeros pares son: "+ aux);

    }

}
