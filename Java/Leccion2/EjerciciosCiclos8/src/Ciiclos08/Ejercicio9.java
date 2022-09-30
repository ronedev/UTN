
package Ciiclos08;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia,mes,anio;
        
        System.out.println("Se le solicitara la fecha en formato DD/MM/AA");
        
        System.out.println("Digite el dia: ");
        dia = Integer.parseInt(input.nextLine());
        if(dia !=0 && dia <= 30){
            System.out.println("Digite el mes: ");
            mes = Integer.parseInt(input.nextLine());
            if(mes != 0 && mes <= 12){
                System.out.println("Digite el año: ");
                anio = Integer.parseInt(input.nextLine());
                if(anio != 0 && anio<=99 ){
                    System.out.println("La fecha ingresada es:" + dia + "/"+mes+"/"+anio);
                }else{
                    System.out.println("El año ingresado no es valido.");
                }  
            }else{
                System.out.println("El mes ingresado no es valido.");
            }
        }else{
            System.out.println("El dia ingresado no es valido.");
        }
        
        JOptionPane.showMessageDialog(null, "Se le solicitara la fecha en formato DD/MM/AA");
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        if(dia !=0 && dia <= 30){
            mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
            if(mes != 0 && mes <= 12){
                anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
                if(anio != 0 && anio<=99 ){
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es:" + dia + "/"+mes+"/"+anio);
                }else{
                    JOptionPane.showMessageDialog(null, "El año ingresado no es valido");
                }  
            }else{
                JOptionPane.showMessageDialog(null, "El mes ingresado no es valido");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El dia ingresado no es valido");
        }
    }
}
