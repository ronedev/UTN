package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Par o impar
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite el numero a evaluar: ");
        int num = Integer.parseInt(input.nextLine());
        
        if(num % 2 == 0)
            System.out.println("El numero " + num + " es par");
        else
            System.out.println("El numero " + num + " es impar");

    }
}
