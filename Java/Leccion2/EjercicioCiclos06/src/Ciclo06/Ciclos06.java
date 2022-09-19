/*
 Ejercicio 6: Pedir numeros hasta que se teclee un 0, mostrar
la suma de todos los numeros introducidos.
 */
package Ciclo06;
import java.util.Scanner;

public class Ciclos06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, suma = 0;
        do{
            System.out.println("Digite un numero: ");
            num = Integer.parseInt(input.nextLine());
            suma += num;
        }while(num != 0);
        
        System.out.println("Ha ingresado el numero 0");
        System.out.println("La suma de todos los numeros ingresados es = " + suma);
    }
}
