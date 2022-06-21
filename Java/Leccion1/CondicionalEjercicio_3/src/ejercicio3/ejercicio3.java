
package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite un numero entre 0 y 10: ");
        var calificacion = Integer.parseInt(input.nextLine());
        /*
        if(calificacion >= 9 && calificacion <= 10){
            System.out.println("A");
        }else if(calificacion >= 8 && calificacion < 9){
            System.out.println("B");
        }else if (calificacion >= 7 && calificacion < 8){
            System.out.println("C");
        }else if(calificacion >= 6 && calificacion < 7){
            System.out.println("D");
        }else if (calificacion >= 5 && calificacion < 6){
            System.out.println("E");
        }else if (calificacion >= 0 && calificacion < 5){
            System.out.println("F");
        }else{
            System.out.println("Fuera de rango");
        }*/
        switch(calificacion){
            case 0: case 1: case 2: case 3: case 4:
                System.out.println("F");
                break;
            case 5:
                System.out.println("E");
                break;
            case 6:
                System.out.println("D");
                break;
            case 7:
                System.out.println("C");
                break;
            case 8:
                System.out.println("B");
                break;
            case 9: case 10:
                System.out.println("A");
                break;
            default:
                System.out.println("Fuera de rango");
        }
    }
}
