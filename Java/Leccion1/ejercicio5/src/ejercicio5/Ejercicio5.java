package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*Programa que calcule e imprima la suma de tres calificaciones pidiendo
        las calificaciones al usuario
        */
        float calificacion1, calificacion2, calificacion3, sumaCalificaciones;
        var input = new Scanner(System.in);
        
        System.out.println("Ingrese la calificaion N°1: ");
        calificacion1 = Float.parseFloat(input.nextLine());
        
        System.out.println("Ingrese la calificaion N°2: ");
        calificacion2 = Float.parseFloat(input.nextLine());
        
        System.out.println("Ingrese la calificaion N°3: ");
        calificacion3 = Float.parseFloat(input.nextLine());
        
        sumaCalificaciones = calificacion1 + calificacion2 + calificacion3;
        System.out.println("La suma de las calificaciones es = " + sumaCalificaciones);
        
    }
    
}
