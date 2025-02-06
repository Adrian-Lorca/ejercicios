package incidencias;

public class Main {
    public static void main(String[] args) {

        Incidencia ine1 = new Incidencia(105, "No tiene acesso a internet");
        Incidencia ine2 = new Incidencia(14, "No arranca");
        Incidencia ine3 = new Incidencia(5, "La pantalla se ve rosa");
        Incidencia ine4 = new Incidencia(237, "Hace un ruido extraño");
        Incidencia ine5 = new Incidencia(111, "Se cuelga al abrir 3 ventanas");

        ine2.resuelve("El equipo no estaba enchufado");
        ine3.resuelve("Cambio del cable VGA");

        System.out.println(ine1);
        System.out.println(ine2);
        System.out.println(ine3);
        System.out.println(ine4);
        System.out.println(ine5);

        System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());

    }
}
