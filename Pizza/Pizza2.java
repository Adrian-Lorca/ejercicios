package Pizza;

public class Pizza2 {
    private static int pedidas_estado = 0;
    private static int servidas_estado = 0;

    private String tamaño;
    private String tipo;
    private String estado;


    public Pizza2(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedido";
        pedidas_estado++;
    }
    public int getTotalPedidas() {
        return pedidas_estado;
    }
    public int getTotalServidas() {
        return servidas_estado;
    }
    public void sirve() {
        if(this.estado.equals("pedido")) {
            this.estado = "servida";
            servidas_estado++;
        }
    }
    @Override
    public String toString() {
        return "Pizza " + tamaño + " " + tipo + " " + ": " + estado;
    }
}
