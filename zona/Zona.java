package zona;

public class Zona {
    
    private int entradasPorVender;


    public Zona(int n) {
        entradasPorVender = n;
    }
    public int getentradasPorVender() {
        return entradasPorVender;
    }
    public void vender(int n){
        if(this.entradasPorVender == 0) {
            System.out.println("Lo siento las entradas estan agotadas: ");
        } else if (this.entradasPorVender < n) {
            System.out.println("Solo me quedan " + this.entradasPorVender + " entradas para eso zona.");
        }
        if (this.entradasPorVender >= n) {
            entradasPorVender = n;
            System.out.println("Aqui tiene sus " + n + " entradas, gracias.");
        }
    }
}
