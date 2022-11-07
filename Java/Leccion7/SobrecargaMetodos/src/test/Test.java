package test;

import operaciones.Operaciones;

public class Test {
    public static void main(String[] args) {
        int resultado = Operaciones.sumar(5, 7);
        System.out.println("resultado = " + resultado);
        
        double resultado2 = Operaciones.sumar(5.8642, resultado);
        System.out.println("resultado2 = " + resultado2);
        
        double resultado3 = Operaciones.sumar(7, 6L);
        System.out.println("resultado3 = " + resultado3);
    }
}
