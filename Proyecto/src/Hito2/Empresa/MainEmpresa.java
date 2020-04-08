package Hito2.Empresa;

import java.util.Scanner;

public class MainEmpresa {
    public static void main(String [] args){
        Scanner leer = new Scanner (System.in);
        boolean salir = true;

        System.out.println("Ingrese numero de empleados");
        int n = leer.nextInt();

        Empleado[] empleadosRRHH = new Empleado[n];

        for(int i=0;i<n;i++){

            System.out.println("Ingrese el nombre del empleado");
            String nombre = leer.next();

            System.out.println("Ingrese Ci del Empleado");
            String ci = leer.next();

            System.out.println("Ingrese eded del empleado");
            int edad = leer.nextInt();

            Empleado emp1 = new Empleado(nombre,ci,edad);
            empleadosRRHH[i] =emp1;
        }

        Area area1 = new Area("RRHH",empleadosRRHH);
        Area[] Areas = new Area[1];
        Areas[0] = area1;
        Empresa empresa = new Empresa("Pedros",Areas);

        empresa.Imprimir();

    }
}
