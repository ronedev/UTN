import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Con Scanner
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = Integer.parseInt(entrada.nextLine());
        while(num != 0){
            if(num % 2 == 0){
                System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
            }
            System.out.println("Ingrese otro numero");
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Ingeso el numero 0");
        
        //Con JOptionPane
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        while(num != 0){
            if(num % 2 == 0){
                num = Integer.parseInt(JOptionPane.showInputDialog("El numero es par. Ingrese otro numero"));
            }else{
                num = Integer.parseInt(JOptionPane.showInputDialog("El numero es impar. Ingrese otro numero"));
            }
        }
        System.out.println("Ingreso el numero 0");
    }
}
