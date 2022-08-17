package clase_11_ejercicio1;

import java.util.Scanner;

public class Clase_11_Ejercicio1 {

    public static void main(String[] args) {
        /*Determinar si un alumno aprueba o reprueba
        un curso, sabiendo que aprobara si su promedio de tres
        calificaciones es mayor o igual a 70*/
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite las 3 calificaciones");
        System.out.print("1: ");
        float nota1 = Float.parseFloat(input.nextLine());
        System.out.print("2: ");
        float nota2 = Float.parseFloat(input.nextLine());
        System.out.print("3: ");
        float nota3 = Float.parseFloat(input.nextLine());
        
        float promedio = (nota1 + nota2 + nota3)/3;
        
        if(promedio >= 70){
            System.out.println("El alumno esta aprobado con: " +  promedio);
        }else{
            System.out.println("El alumno esta desaprobado con: " +  promedio);
        }
    }
}
