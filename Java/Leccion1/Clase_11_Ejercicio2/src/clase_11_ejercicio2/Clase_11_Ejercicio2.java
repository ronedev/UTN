package clase_11_ejercicio2;

import java.util.Scanner;

public class Clase_11_Ejercicio2 {
    public static void main(String[] args) {
        /*En un almacen se hace un 20% de descuento a los clientes
        cuya compra supere los $100. ¿Cual sera la cantidad que pagara
        una persona por su compra?*/
        
        double descuento, totalPagar, precioFinal;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("¿Cuanto debe pagar? ");
        totalPagar = Double.parseDouble(input.nextLine());
        
        if(totalPagar > 100){
            descuento = (totalPagar*0.2);
        }else{
            descuento = 0;
        }
        
        precioFinal = totalPagar - descuento;
        
        System.out.println("El total a pagar es: " + precioFinal);

    }
    
}
