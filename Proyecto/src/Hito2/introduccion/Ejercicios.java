package Hito2.introduccion;

import java.util.Scanner;

public class Ejercicios {
    public Scanner leer;
    public Ejercicios (){
        leer = new Scanner(System.in);
    }
    public void seriesNaturales(int n){
        for(int i=1; i <=n ;i++){
            System.out.println(i);
        }
    }
    public void compara2cadenas(String cad1,String cad2){
        if(cad1.equals(cad2))
        {
            System.out.println("Cadenas iguales");

        }else{
            System.out.println("Cadenas distintas");
        }
    }
    public void cadena(int x){

        int cont = 0;
        while(cont< x){
            for(int i=0; i<x; i++){
                if(i%2==0) {
                    System.out.printf("%d ",i+2);
                }else{
                    System.out.printf("%d " ,i);
                }
                cont++;
            }
        }
    }
    //crear un while(hastnext
    //leerOption = compara
}
