package clases.seresvivos;

public class main {
    public static void main(String[] args) {
        //darle valor y obtenerlos 
        Animal animal = new Animal();
        Mamifero mamifero = new Mamifero();
        Ave ave = new Ave();
        Perro perro = new Perro();
        Gato gato = new Gato();
        animal.restablecernombre("Guepardo");
        animal.restableceredad(5);
        animal.restablecertipo("Acinonyx");
        mamifero.restablecernombre("Vaca");
        mamifero.restableceredad(25);
        mamifero.restablecertipo("Artiodactilo");
        ave.restablecernombre("Pajaro");
        ave.restableceredad(1);
        ave.restablecertipo("Canario");
        perro.restablecernombre("Toby");
        perro.restableceredadedad(20);
        perro.restablecertipo("pastor aleman");
        gato.restablecernombre("Misifu");
        gato.restableceredad(20);
        gato.restablecertipo("Siames");

        System.out.println("El nombre del animal es: " + animal.obtenernombreanimal());
        System.out.println("La edad del animal es: " + animal.obteneredadanimal());
        System.out.println("El tipo de animal es: " + animal.obtenertipoanimal());

        System.out.println("El nombre del mamifero es: " + mamifero.obtenernombremamifero());
        System.out.println("La edad del mamifero es: " + mamifero.obteneredadmamifero());
        System.out.println("El tipo de mamifero es: " + mamifero.obtenertipomamifero());

        System.out.println("El nombre del ave es: " + ave.obtenernombreave());
        System.out.println("La edad del ave es: " + ave.obteneredadave());
        System.out.println("El tipo de ave es: " + ave.obtenertipoave());

        System.out.println("El nombre del perro es: " + perro.obtenernombreperro());
        System.out.println("La edad del perro es: " + perro.obteneredadperro());
        System.out.println("El tipo de perro es: " + perro.obtenertipoperro());

        System.out.println("El nombre del gato es: " + gato.obtenernombregato());
        System.out.println("La edad del gato es: " + gato.obteneredadgato());
        System.out.println("El tipo de gato es: " + gato.obtenertipogato());
    }
}
