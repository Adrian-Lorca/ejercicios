package zona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zona salaPrincipal = new Zona(1000);
        Zona CompraVenta = new Zona(200);
        Zona vip = new Zona(25);


        while(true) {
            System.out.println("------------------------------------");
            System.out.println("--- \\\\------ Menu --------//// ---");
            System.out.println("------------------------------------");
            System.out.println("    1. Mostrar numero de entradas libres");
            System.out.println("    2. Vender Entradas");
            System.out.println("    3. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Entradas disponibles en la sala principal: " + salaPrincipal.getentradasPorVender());
                    System.out.println("Entradas disponibles en la compraventa: " + CompraVenta.getentradasPorVender());
                    System.out.println("Entradas disponibles en la vip: " + vip.getentradasPorVender());
                    break;
                case 2:
                    System.out.print("Elige la zona: 1 - Sala Principal, 2 - Zona de Compra Venta, 3 - Zona VIP: ");
                    int zona = scanner.nextInt();
                    System.out.println("Numero de entradas que quieres comprar: ");
                    int cantidad = scanner.nextInt();
                
                    switch (zona) {
                        case 1:
                            salaPrincipal.vender(cantidad);
                            break;
                        case 2:
                            CompraVenta.vender(cantidad);
                            break;
                        case 3:
                            vip.vender(cantidad);
                        default:
                        System.out.println("Zona no valida: ");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa.....");
                    scanner.close();
                    System.exit(0);                   
            }  
        }
    }
}
