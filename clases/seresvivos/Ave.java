package clases.seresvivos;

public class Ave {
    //Utilizando atributos 
    String nombre;
    int edad;
    String tipo;
    //Utilizando metodos (3 metodos)
    public String obtenernombreave() {
        return nombre;
    }
    public int obteneredadave() {
        return edad;
    }
    public String obtenertipoave() {
        return tipo;
    }
    public void restablecernombre(String nombre_ave) {
        nombre = nombre_ave;
    }
    public void restableceredad(int edad_ave) {
        edad = edad_ave;
    }
    public void restablecertipo(String tipo_ave) {
        tipo = tipo_ave;
    }
}
