package clases.seresvivos;

public class Mamifero {
    //Utilizando atributos
    String nombre;
    int edad;
    String tipo;
    //Utilizando metodos (3 metodos) 
    public String obtenernombremamifero() {
        return nombre;
    }
    public int obteneredadmamifero() {
        return edad;
    }
    public String obtenertipomamifero() {
        return tipo;
    }
    public void restablecernombre(String nombre_mamifero) {
        nombre = nombre_mamifero;
    }
    public void restableceredad(int edad_mamifero) {
        edad = edad_mamifero;
    }
    public void restablecertipo(String tipo_mamifero) {
        tipo = tipo_mamifero;
    }
}
