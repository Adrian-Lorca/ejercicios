package cubo;

public class Main {
    public static void main(String[] args) {
        Cubo cubo1 = new Cubo(3.5, 9);
        Cubo cubo2 = new Cubo(28, 10);

        cubo1.setllenar(9.2);
        cubo2.setllenar(5.42);

        System.out.println(cubo1);
        System.out.println(cubo2);

        cubo1.setpasarliquido(cubo2, 2.5);
        cubo2.setpasarliquido(cubo1, 4.8);

        System.out.println("Se ha transferido correctamente el liquido al cubo 2");
        System.out.println(cubo1);
        System.out.println(cubo2);
    }
}
