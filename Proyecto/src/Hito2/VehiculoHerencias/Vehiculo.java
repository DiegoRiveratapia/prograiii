package Hito2.VehiculoHerencias;

public class Vehiculo {
    public String placa;
    public int nrRuedas;
    public int nrAsientos;

    public Vehiculo(String placa, int nrRuedas, int nrAsientos) {
        this.placa = placa;
        this.nrRuedas = nrRuedas;
        this.nrAsientos = nrAsientos;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return this.placa = placa;
    }
}
