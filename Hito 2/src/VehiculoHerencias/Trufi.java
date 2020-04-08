package VehiculoHerencias;

public class Trufi extends Vehiculo{

    public Trufi(String placa,int nrRuedas,int nrAsientos){
        super(placa,nrRuedas,nrAsientos);
    }
    public void impTrufi(){
        System.out.println(getPlaca());
    }

}
