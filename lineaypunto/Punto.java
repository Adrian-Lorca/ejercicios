package lineaypunto;

public class Punto {
   private double coordenada_x;
   private double coordenada_y;
   

   public Punto(double coordenadax, double coordenaday) {
    this.coordenada_x = coordenadax;
    this.coordenada_y = coordenaday;
   } 

   public double getcoordenadaX() {
    return coordenada_x;
   }

   public double getcoordenadaY() {
    return coordenada_y;
   }

   public void setcoordenadaX(int coordenadaX) {
    this.coordenada_x = coordenadaX; 
   }
   
   public void setcoordenadaY(int coordenadaY) {
    this.coordenada_y = coordenadaY;
   }
   
   @Override
   public String toString() {
    String punto = "(" + coordenada_x + "," + coordenada_y + ")";
    return punto;
   }
}
