package bicicleta;

class Bicicleta {  
    //Atributos 
    private static final String objeto = "Mi bicicleta";
    private static final String color = "Negro";
    private static final int velocidad = 0;
    private static final int Marcha = 2;

    //metodos 
    public String getcolor() {
        return color;
    }
    public int getvelocidad() {
        return velocidad;
    }
    public int getMarcha() {
        return Marcha;
    }
    public void setavanzar(int velocidad_bicleta) {
        velocidad = velocidad_bicleta;
    }
    public void setcambiardemarcha(int marcha) {
       int Marcha = 2;
    }
    public void setfrenar(int velociad_frenado) {
        int velocidad = 0;
    }
}
