package clases.seresvivos;

public class Gato {
    //Utilizando atributos
    String nombre;
    int edad;
    String tipo;
    //Utilizando metodos (3 metodos)
    public String obtenernombregato() {
        return nombre;
    }
    public int obteneredadgato() {
        return edad;
    }
    public String obtenertipogato() {
        return tipo;
    }
    public void restablecernombre(String nombre_gato) {
        nombre = nombre_gato;
    }
    public void restableceredad(int edad_gato) {
        edad = edad_gato;
    }
    public void restablecertipo(String tipo_gato) {
        tipo = tipo_gato;
    }
}
