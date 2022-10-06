/*
 Ejercicio 10: Pedir 10 numeros y escribir la suma total
Hacerlo con Scanner y JOptionPane
 */
package Ciclos10;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        int i = 0;
        int res = 0;
        int num;
        Scanner input = new Scanner(System.in);
        while(i < 10){
            System.out.println("Ingrese un numero");
            num = Integer.parseInt(input.nextLine());
            res = res + num;
            i += 1;
        }
        System.out.println("El resultado de la suma de los numeros ingresados es = " + res);
        
        res = 0;
        i = 0;
        
        while(i < 10){
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            res = res + num;
            i += 1;
        }
        JOptionPane.showMessageDialog(null, "El resultado de la suma de los numeros ingresados es: " + res);
    }
}
