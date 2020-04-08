package Transporte;

class Bicicleta {
    private int nroRuedas;
    private String Color;

     public void color(){
         System.out.printf("Color de la bicicleta es: %s \n ",this.getColor());
     }
    public void nroRuedas(){
        System.out.printf("Nro de ruedas de la Bicicleta es: %d \n",this.getNroRuedas());
    }
    public int getNroRuedas() {
        return nroRuedas;
    }

    public void setNroRuedas(int nroRuedas) {
        this.nroRuedas = nroRuedas;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
