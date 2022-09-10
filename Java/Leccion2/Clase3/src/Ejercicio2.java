import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
   //Con Scanner
        Scanner entrada = new Scanner(System.in);
        
        int counter = 0;
        
        System.out.println("Ingrese un numero");
        int num = Integer.parseInt(entrada.nextLine());
        while(num >= 0){
            counter +=1;
            System.out.println("Ingrese otro numero");
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Ingreso un total de " + counter + " numeros antes de ingresar uno negativo");
        
        //Con JOptionPane
        counter = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        while(num >= 0){
            counter +=1;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        }
        JOptionPane.showMessageDialog(null, "Ingreso un total de " + counter + " numeros antes de ingresar uno negativo");

}
}
