package fracciones;

public class Main {
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion();
        Fraccion fraccion2 = new Fraccion();
        Fraccion resultado = new Fraccion();
        fraccion1.setFraccion(5, 8);
        fraccion2.setFraccion(20, 18);
        
        resultado = Fraccion.multiplica(fraccion1, fraccion2);
        System.out.printf("La multiplicacion de fraccion1 y fraccion2 es: " + resultado.getnumerador() * resultado.getdenominador());

        fraccion1.simplificar();
        fraccion2.simplificar();

        System.out.println("La forma simplificada de la fraccion es: " + fraccion1.getnumerador() * fraccion2.getdenominador());
    
    }
}
