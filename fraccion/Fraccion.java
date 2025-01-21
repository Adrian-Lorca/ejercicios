package fracciones;

class Fraccion {

    // atributos de objeto
    private int numerador;
    private int denominador;
    
    //metodos
    public int numerador() {
        return numerador;
    }
    public int denominador() {
        return denominador;
    }
    
    static Fraccion multiplica(Fraccion fraccion1, Fraccion fraccion2) {
       Fraccion resultado = new Fraccion();
       resultado.setFraccion(fraccion1.getnumerador() * fraccion2.getnumerador(), fraccion1.getdenominador() * fraccion2.getdenominador());
       return(resultado);
    }
   
    static Fraccion divide(Fraccion fraccion1, Fraccion fraccion2) {
        Fraccion resultado = new Fraccion();
        resultado.setFraccion(fraccion1.getnumerador() * fraccion2.getdenominador(),fraccion1.getdenominador() * fraccion2.getnumerador());
        return(resultado);
    }
    static int mcd(int numeradorf1, int denominadorf2) {
        if(denominadorf2 == 0) {
            return numeradorf1;
        }
        return mcd(denominadorf2, numeradorf1 % denominadorf2);
    }
    public void invierte() {

        int denominadorNuevo = numerador;
        int numerador = denominador;
        denominador = denominadorNuevo;
    }
    
    public void setFraccion(int num, int dem) {
        numerador = num;
        denominador = dem;
    }
    public void simplificar() {
        int mcd = mcd(numerador, denominador);
        numerador = mcd;
        denominador = mcd;
        
    }
    public int getnumerador() {
        return numerador;
    }
    public int getdenominador() {
        return denominador;
    }
}
