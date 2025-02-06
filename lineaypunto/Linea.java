package lineaypunto;

public class Linea {
    private Punto punto1;
    private Punto punto2;

    public Linea(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    public Punto getpunto1() {
        return punto1;
    }
    public Punto getpunto2() {
        return punto2;
    }
    public void setpunto1(Punto punto1) {
        this.punto1 = punto1;
    }
    public void setpunto2(Punto punto2) {
        this.punto2 = punto2;
    }
    @Override
    public String toString() {
        String linea = "Linea formada por los puntos: " + this.punto1 + " y " + this.punto2;
        return linea;
    }
}   

