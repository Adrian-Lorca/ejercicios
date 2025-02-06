package incidencias;

public class Incidencia {

    private static int contador_codigo = 1;
    private static int incidencia_pendientes = 0;

    private int codigo;
    private int n_puesto;
    private String estado;
    private String incidencia;
    private String resolucion;


    public Incidencia(int puesto, String incidencia) {
        this.codigo = contador_codigo++;
        this.n_puesto = puesto;
        this.incidencia = incidencia;
        this.estado = "Pendiente";
        incidencia_pendientes++;   
    }
    
    public static int getPendientes() {
        return incidencia_pendientes;
    }

    public void resuelve(String resolucion) {
        if(this.estado.equals("Pendiente")) {
            this.estado = "Resuelta";
            this.resolucion = resolucion;
            incidencia_pendientes--;    
        }
    }

    @Override
    public String toString(){
        String incidencia = "Incidencia:  " + this.codigo + " - Puesto: " + this.n_puesto + " - " + this.incidencia + " - " + this.estado;
        if(this.estado.equals("Resuelta")) {
            incidencia += " - " + this.resolucion;
        }
        return incidencia;
    }
}
