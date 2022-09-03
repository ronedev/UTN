/*
Ejercicio 2: Leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que sea 0
*/
package ejercicio2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercicio2 {
    public static void main(String[] args) {
        //Con Scanner
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = Integer.parseInt(entrada.nextLine());
        while(num != 0){
            if(num > 0){
                System.out.println("El numero es positivo");
            }else{
                System.out.println("El numero es negativo");
            }
            System.out.println("Ingrese otro numero");
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Ingeso el numero 0");
        
        //Con JOptionPane
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        while(num != 0){
            if(num < 0){
                num = Integer.parseInt(JOptionPane.showInputDialog("El numero es negativo. Ingrese otro numero"));
            }else{
                num = Integer.parseInt(JOptionPane.showInputDialog("El numero es positivo. Ingrese otro numero"));
            }
        }
        System.out.println("Ingreso el numero 0");
    }
    
}
