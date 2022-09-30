
package Ciiclos08;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.println("Digite un numero: ");
        num = Integer.parseInt(input.nextLine());
        
        for(int i=1; i<=num; i++){
            System.out.println("i = " + i);
        }
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        for(int i=1; i<=num; i++){
            JOptionPane.showMessageDialog(null, "i = " + i);
        }
    }
}
