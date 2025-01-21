package clases.seresvivos;

public class Animal {
    //dando atributos a la clase 
    String nombre;
    int edad;
    String tipo;
    // utilizando metodos (3 metodos)
    public String obtenernombreanimal() {
        return nombre;
    }
    public int obteneredadanimal() {
        return edad;
    }
    public String obtenertipoanimal() {
        return tipo;
    }
    public void restablecernombre(String nombre_animal) {
        nombre = nombre_animal;
    }
    public void restableceredad(int edad_animal) {
        edad = edad_animal;
    }
    public void restablecertipo(String tipo_animal) {
        tipo = tipo_animal;
    }
}


