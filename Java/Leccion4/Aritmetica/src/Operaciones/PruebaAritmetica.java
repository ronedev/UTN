
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("El resultado es: " + resultado);
        
        System.out.println("El resultado con argumentos es: " + aritmetica1.sumarConArgumentos(15, 30));
    }
}
