package Pizza;

class Pizza {

    private static int pizzas_pedidas = 0;
    private static int pizzas_servidas = 0;

    private String tamaño;
    private String tipo;
    private String estado;

    public Pizza(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
        pizzas_pedidas++;
    }
    public static int getTotalPedidas() {
        return pizzas_pedidas;
    }

    public static int getTotalServidas() {
        return pizzas_servidas;
    }
    public void sirve() {
        if(this.estado.equals("pedida")) {
            this.estado = "servida";
            pizzas_servidas++;
        } else {
            System.out.println("Esta pizza ya se ha servido");
        }
    }
    @Override
    public String toString() {
        String pizza = "Pizza " + this.tipo + " " + this.tamaño + ", " + this.estado;
        return pizza;
    }
}
