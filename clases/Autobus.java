package clases;

public class Autobus {
    String matricula;
    String modelo;
    float potenciaCV;
    int numeroPlazas;

    String getmatricula() {
        return matricula;
    }
    String getmodelo() {
        return modelo;
    }
    float getpotenciaCV() {
        return potenciaCV;
    }
    int getnumero_Plazas() {
        return numeroPlazas;
    }
    void setmatricula(String matricula_autobus) {
        matricula = matricula_autobus;
    }
    void setmodelo(String modelo_autobus) {
        modelo = modelo_autobus;
    }
    void setpotenciaCV(float potencia_autobus) {
        potenciaCV = potencia_autobus;
    }
    void setnumeroPlazas(int numero) {
        numeroPlazas = numero;
    }
    public static void main(String[] args) {
        Autobus autobus = new Autobus();
        autobus.setmatricula("6789797T");
        autobus.setmodelo("Twg");
        autobus.setpotenciaCV(125);
        autobus.setnumeroPlazas(50);

        System.out.println("La matricula del autobus es: " + autobus.getmatricula());
        System.out.println("El modelo del autobus es: " + autobus.getmodelo());
        System.out.println("La potencia del autobus es de: " + autobus.getpotenciaCV());
        System.out.println("El numero de plazas que dispone el autobus es de: " + autobus.getnumero_Plazas());
    }
}
