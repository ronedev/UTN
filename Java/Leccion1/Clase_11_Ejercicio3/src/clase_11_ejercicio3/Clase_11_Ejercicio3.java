package clase_11_ejercicio3;

import java.util.Scanner;

public class Clase_11_Ejercicio3 {
    public static void main(String[] args) {
        /*Leer 2 numeros; si son iguales que los multiplique
        si el primero es mayor que el segundo que se resten
        y si no que se sumen*/
        Scanner input = new Scanner(System.in);
        
        double num1, num2, resultado;
        
        System.out.print("Digite el numero 1: ");
        num1 = Double.parseDouble(input.nextLine());
        System.out.print("Digite el numero 2: ");
        num2 = Double.parseDouble(input.nextLine());
        
        if(num1 == num2){
            resultado = num1 * num2;
        }else if(num1 > num2){
            resultado = num1 - num2;
        }else{
            resultado = num1 + num2;
        }
        
        System.out.println("El resultado es: " + resultado);
        
    }
    
}
