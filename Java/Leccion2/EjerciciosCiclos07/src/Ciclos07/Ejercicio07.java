
package Ciclos07;

import javax.swing.JOptionPane;

public class Ejercicio07 {
    public static void main(String[] args) {

        int num, count = 0, suma = 0;
        float promedio = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(num >= 0){
            suma += num;
            count++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        if(count == 0){
            JOptionPane.showMessageDialog(null, "Error, la division entre cero no existe");
        }else{
            promedio = (float)suma / count;
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+ suma);
            JOptionPane.showMessageDialog(null, "El resultado del promedio es: "+ promedio);
        }
    }
}
