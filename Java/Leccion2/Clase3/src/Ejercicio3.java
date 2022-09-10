import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
   //Con Scanner
        Scanner entrada = new Scanner(System.in);
        
        var n = Math.round(Math.random() * 100);
        
        System.out.println(n);
        System.out.println("Ingrese un numero");
        int num = Integer.parseInt(entrada.nextLine());
        while(num != n){
            if(num > n){
                System.out.println("Es mas chico!");
            }else{
                System.out.println("Es mas grande!");
            }
            System.out.println("Ingrese otro numero");
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Correcto, el numero es: " + n + ". Ganaste, felicidades!");
        
        //Con JOptionPane
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        while(num != n){
            if(num > n){
                num = Integer.parseInt(JOptionPane.showInputDialog("El numero a adivinar es mas chico. Intenta con otro numero"));
            }else{
                num = Integer.parseInt(JOptionPane.showInputDialog("El numero a adivinar es mas grande. Intenta con otro numero"));
            }
        }
        JOptionPane.showMessageDialog(null, "Correcto, el numero es: " + n + ". Ganaste, felicidades!");

}
}
