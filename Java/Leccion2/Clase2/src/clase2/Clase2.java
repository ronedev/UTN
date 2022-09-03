
package clase2;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo
*/

public class Clase2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, cuadrado;
        
        System.out.println("Ingrese un numero");
        num = Integer.parseInt(input.nextLine());
        
        while(num >= 0){
            cuadrado = (int)Math.pow(num, 2);
            System.out.println("El numero "+ num + " elevado al cuadrado es: "+ cuadrado);
            System.out.println("Ingrese otro numero");
            num = Integer.parseInt(input.nextLine());
        }
        System.out.println("Numero ingresado negativo");
        
        /*
        Mismo ejercicio utilizando la libreria JOptionPane
        */
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        while(num >= 0){
            cuadrado = (int)Math.pow(num, 2);
            System.out.println("El numero "+ num + " elevado al cuadrado es: "+ cuadrado);
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        }
        System.out.println("Numero ingresado negativo");
    }
    
}
