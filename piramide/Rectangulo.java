package piramide;

public class Rectangulo {
    private double altura;
    private double base;
    private static int contador = 0;


    public Rectangulo(double Base, double Altura) {
        this.base = Base;
        this.altura = Altura;
        contador ++;
    }

    public static int getRectangulosCreados() {
        return contador;
    }

    public double getbase() {
        return base;
    }

    public double getaltura() {
        return altura;
    }

    public void setbase(double base) {
        this.base = base;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString() {
        String cadena = " ";
        for(int i = 0; i < this.altura; i++) {
            for(int j = 0; j < this.base; j++) {
                cadena += "*";
            }
            cadena += "\n";
        }
        return cadena;
    }
}
