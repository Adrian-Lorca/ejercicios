package piramide;

public class Piramide {
    private double altura;
    private static int contador = 0;


    public Piramide(double Altura) {
        this.altura = Altura;
        contador ++;
    }
    public static int getPiramidesCreadas() {
        return contador;
    }
    public double getaltura() {
        return altura;
    }
    public void setaltura(double Altura) {
        this.altura = Altura;
    }
    @Override
    public String toString() {
        String cadena = " ";
        
        for(int i = 0; i < this.altura; i++) {
            for(int j = 0; j < this.altura -i -1; j++) {
                cadena = "";
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                cadena += "*";
            }
            cadena += "\n";
        }
        return cadena;
    }
}
