
package caja;

class Caja {
    //Atriobutos
    int ancho, alto, prof;
    
    //Constructores
    public Caja(){
        System.out.println("Contructor sin parametros");
    }
    
    public Caja(int ancho, int alto, int prof){
        this.alto = alto;
        this.ancho = ancho;
        this.prof = prof;
        System.out.println("Constructor con parametros");
    }
    
    //Metodo para calcular volumen
    public int CalcularVolumenConParametros(int ancho, int alto, int prof){
        this.alto = alto;
        this.ancho = ancho;
        this.prof = prof;
        
        return this.alto * this.ancho * this.prof;
    }
    public int CalcularVolumenSinParametros(){
        return this.alto * this.ancho * this.prof;
    }
}
