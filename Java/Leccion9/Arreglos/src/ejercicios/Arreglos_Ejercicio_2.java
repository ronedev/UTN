/*
Leer 5 numeros y guardarlos en un arreglo. Luego mostrarlos en el orden CONTRARIO que fueron ingresados
*/
package ejercicios;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numeros[] = new float[5];
    
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese un numero");
            numeros[i] = input.nextFloat();
        }
        
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("numeros["+ i+"] = " + numeros[i]);
        }
    }
}
