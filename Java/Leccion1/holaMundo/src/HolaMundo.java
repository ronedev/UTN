
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        int num1;
        int num2;
        int resultado;
        String saludo = "Hola mundo desde java";
        String saludo2 = "Hola manola";
        //Para comparar string se utiliza equals, no ===
        
        int miVariableReutilizable = 10;
        System.out.println(miVariableReutilizable);
        miVariableReutilizable = 5;
        System.out.println(miVariableReutilizable);
        
        //Tipo string
        String miVariableString = "holitaaa";
        System.out.println(miVariableString);
        
        miVariableString = "otra cadena";

        
        System.out.println(saludo.equals(saludo2));//retorna false
        
        System.out.println(saludo + saludo2); //Cuando se suman string se concatena
        
        Scanner leerNum = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = leerNum.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = leerNum.nextInt();
        
        resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
        
    }
}
