package cubo;

public class Cubo {
    private double capacidad;
    private double litros_contiene;

    public Cubo(double capacidad, double litros_contiene) {
        this.capacidad = capacidad;
        this.litros_contiene = 0;
    }
    public double getcapacidad() {
        return capacidad;
    }
    public double getlitros() {
        return litros_contiene;
    }
    public void setllenar(double cantidad) {
        if(cantidad <= 0) {
            System.out.println("La cantidad a llenar debe ser mayor que 0");
            return;
        }
        if(cantidad + this.litros_contiene <= this.capacidad) {
            this.capacidad += cantidad;
            return;
        } else {
            this.capacidad = cantidad;
            System.out.println("El cubo se ha llenado al completo");
        }
    }
    public void setvaciar(double cantidad) {
        if(cantidad <= 0) {
            System.out.println("La cantidad ha llenar debe ser mayor que 0");
            return;
        }
        if(cantidad - this.litros_contiene >= 0) {
            this.capacidad -= cantidad;
            return;
        } else {
            cantidad = 0;
            System.out.println("El cubo se ha vaciado por completo");
        }
    }
    public void setpasarliquido(Cubo otrocubo, double cantidad) {
        if(cantidad <= 0) {
            System.out.println("La cantidad ha llenar debe ser mayor que 0");
            return;
        }
        if(this.litros_contiene < cantidad) {
            cantidad = this.litros_contiene;
        }
        if (otrocubo.litros_contiene + cantidad > otrocubo.capacidad) {
            cantidad = otrocubo.capacidad - otrocubo.litros_contiene;
        }
        this.litros_contiene -= cantidad;
        otrocubo.litros_contiene += cantidad;
        System.out.println("Se ha pasado " + cantidad + " litros al otro cubo");
    }
}