package test;

import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Agustin", 60000.00);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente("Roberto", 'M', 25, "Coronel Campos 1432", new Date(), false);
        System.out.println("cliente1 = " + cliente1);
    }
}
