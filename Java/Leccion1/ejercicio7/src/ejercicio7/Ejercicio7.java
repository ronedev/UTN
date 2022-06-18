
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int salario = 1000;
        int autosVendidos;
        double totalGanado, valorAutos;
        
        System.out.println("¿Cuantos autos vendio este mes?");
        autosVendidos = Integer.parseInt(input.nextLine());
        
        System.out.println("¿Cuanto salian los autos?");
        valorAutos = Integer.parseInt(input.nextLine());
        
        totalGanado = salario + (150 * autosVendidos) + (autosVendidos * (valorAutos * 0.05));
        
        System.out.println("El total ganado por el empleado fue = " + totalGanado + " dolares" );
    }
    
}
