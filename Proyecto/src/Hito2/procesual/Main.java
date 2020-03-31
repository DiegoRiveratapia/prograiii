package Hito2.procesual;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Profesor p1 = new Profesor();
        p1.Leer();
        p1.Mostrar();
        Profesor p2 = new Profesor();
        p2.Leer();
        p2.Mostrar();
        Policia pol = new Policia();
        pol.Leer();
        pol.Mostrar();
        Policia pol2 = new Policia();
        pol2.Leer();
        pol2.Mostrar();


            if (p1.ciudad == pol.destinos[pol.nroDestinos]) {
                System.out.println("Las materias son iguales");
            }

    }
}
