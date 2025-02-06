package Pizza;

public class Main2 {
    public static void main(String[] args) {
        Pizza2 p1 = new Pizza2("margarita", "mediana");
        Pizza2 p2 = new Pizza2("funghi", "familiar");
        p2.sirve();
        Pizza2 p3 = new Pizza2("cuatro quesos", "mediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("Pedidas: " + Pizza.getTotalPedidas());
        System.out.println("Servidas: " + Pizza.getTotalServidas());
    }
}

