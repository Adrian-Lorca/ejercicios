package Tiempo;

public class Main {
    public static void main(String[] args) {
        Tiempo tiempo1 = new Tiempo(1, 20, 5);
        Tiempo tiempo2 = new Tiempo(10, 35);
 

        System.out.println(tiempo1);
        System.out.println(tiempo2);

        tiempo1.suma(tiempo2);
        System.out.println("la suma es: " + suma);

        tiempo1.resta(tiempo2);
        System.out.println("La resta es: " + resta);
    }
}
