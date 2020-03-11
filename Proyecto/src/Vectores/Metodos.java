package Vectores;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Metodos implements Ordenacion{

    private Integer vector[];
    private Scanner leer;

    public Metodos(){
        leer = new Scanner(System.in);
    }

    public void leerVector() {
        System.out.println("Ingrese tamaño del arreglo");
        int n = leer.nextInt();
        vector = new Integer[n];

        for (int i =0;i<n;i++){
            System.out.printf("Ingrese posicion %d\n",i);
            int numleido= leer.nextInt();
            vector[i]= numleido;
        }
    }
    public void mostrarVector(){
        for(int i=0;i<vector.length;i++){
            System.out.printf("Valor= %d\n",vector[i]);
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



    public void metincercion() {
       // int[]  vector= new int[]{55,66,44,11};

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


}

