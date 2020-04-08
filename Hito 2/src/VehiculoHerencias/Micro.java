package Hito2.VehiculoHerencias;

public class Micro extends Vehiculo {
    public Micro(String placa,int nrRuedas,int nrAsientos){
        super(placa,nrRuedas,nrAsientos);
    }
    public void impTrufi(){
        System.out.println(getPlaca());
    }
}
