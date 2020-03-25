package VehiculoHerencias;

public class Moto extends  Vehiculo{
    public Moto(String placa,int nrRuedas,int nrAsientos){
        super(placa,nrRuedas,nrAsientos);
    }
    public void impMoto(){
        System.out.println(getPlaca());
    }
}
