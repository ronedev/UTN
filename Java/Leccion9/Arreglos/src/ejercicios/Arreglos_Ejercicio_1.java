/*
Leer 5 numeros y guardarlos en un arreglo. Luego mostrarlos en el orden que fueron ingresados
*/
package ejercicios;

import java.util.Scanner;

public class Arreglos_Ejercicio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numeros[] = new float[5];
    
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese un numero");
            numeros[i] = input.nextFloat();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros["+ i+"] = " + numeros[i]);
        }
    }
}
