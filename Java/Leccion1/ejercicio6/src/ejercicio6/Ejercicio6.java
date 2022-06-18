package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        float guillermo, luis, juan, total;
        
        System.out.println("Ingrese cuantos dolares tiene Guillermo: ");
        guillermo = Float.parseFloat(input.nextLine());
        
        luis= guillermo /2;
        juan = (guillermo + luis) / 2;
        
        total = guillermo + luis + juan;
        
        System.out.println("Entre los tres tienen " + total + " dolares");
    }
    
}
