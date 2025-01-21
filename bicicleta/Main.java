package bicicleta;

public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        

        System.out.println("La bicicleta se encuentra avanzando");
        System.out.println("El color de la bicicleta es: " + bicicleta.getcolor());
        System.out.println("La bicicleta tiene una velocidad de : " + bicicleta.getvelocidad() + "Km/h");
        System.out.println("La bicicleta tiene un cambio de marcha de: " + bicicleta.getMarcha());

    }
}
