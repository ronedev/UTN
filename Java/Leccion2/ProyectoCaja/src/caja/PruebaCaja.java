
package caja;

public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        
        int volumen = caja1.CalcularVolumenConParametros(2, 5, 3);
        System.out.println("volumen = " + volumen);
        
        Caja caja2 = new Caja(3, 3, 5);
        
        volumen = caja2.CalcularVolumenSinParametros();
        System.out.println("volumen = " + volumen);
    }
}
