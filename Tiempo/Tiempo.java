package Tiempo;

public class Tiempo {

    private int horas;
    private int minutos;
    private int segundos;

    //constructores 
    public Tiempo(int h, int m, int s) {
        this.horas = h;
        this.minutos = m;
        this.segundos = s;
    }
    public Tiempo(int h) {
        this.horas = h;
        this.minutos = 0;
        this.segundos = 0;
    }
    public Tiempo(int h, int m) {
        this.horas = h;
        this.minutos = m;
        this.segundos = 0;
    }
    public void suma(Tiempo t) {
        this.horas += t.horas;
        this.minutos += t.minutos;
        this.segundos += t.segundos;
        ajustartiempo();
    }
    public void resta(Tiempo t) { 
        this.horas -= t.horas;
        this.minutos -= t.minutos;
        this.segundos -= t.segundos;
        ajustartiempo();
    }
    private void ajustartiempo() {
        if(this.segundos >= 60) {
            this.segundos -= 60;
            this.minutos++;
        }
        else if (this.segundos < 0) {
            this.segundos += 60;
            this.minutos--;
        }
        if(this.minutos >= 60) {
            this.minutos -= 60;
            this.horas ++;
        }
        else if(this.minutos < 0) {
            this.minutos += 60;
            this.horas--;
        }
    } 
    @Override
    public String toString() {
        return this.horas + "h " + this.minutos + "m " + this.segundos + "s ";
    }
}
