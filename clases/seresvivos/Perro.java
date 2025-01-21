package clases.seresvivos;

public class Perro {
    //Utilizar atributos
    String nombre;
    int edad;
    String tipo;
    //Utilizar metodos (3 metodos)
    public String obtenernombreperro() {
        return nombre;
    }
    public int obteneredadperro() {
        return edad;
    }
    public String obtenertipoperro() {
        return tipo;
    }
    public void restablecernombre(String nombre_perro) {
        nombre = nombre_perro;
    }
    public void restableceredadedad(int edad_perro) {
        edad = edad_perro;
    }
    public void restablecertipo(String tipo_perro) {
        tipo = tipo_perro;
    }
}
