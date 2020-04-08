package Hito2.procesual;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
        public static void main(String[] args) {
            Policia po1 = new Policia();

            po1.Leer();
            po1.Mostrar();
            Profesor pf1 = new Profesor();
            pf1.Leer();
            pf1.Mostrar();
            System.out.println(pf1.verificaCiudad(po1.getDestinos()));

        }
}
