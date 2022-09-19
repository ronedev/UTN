/*
Ejercicio 7: Pedir numero hasta que se introduzca uno negativo y calcular la media
*/

package Ciclos07;

import java.util.Scanner;

public class Ciclos07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count = 0, suma = 0;
        float promedio = 0;
        System.out.println("Digite un numero: ");
        num = Integer.parseInt(input.nextLine());
        while(num >= 0){
            suma += num;
            count++;
            System.out.println("Digite otro numero: ");
            num = Integer.parseInt(input.nextLine());
        }
        if(count == 0){
            System.out.println("Error, la division entre cero no existe");
        }else{
            promedio = (float)suma / count;
            System.out.println("suma = " + suma);
            System.out.println("promedio = " + promedio);   
        }
    }
}
