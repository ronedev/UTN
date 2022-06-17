
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        /*int num1;
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
        System.out.println(miVariableString);
        
        */
        
        //var -inferencia de tipos en Java
        /*
        var miVariableEntera2 = 10;        
        var miVariableCadena2 = "seguimos estudiando";
        
        System.out.println("mi variable entera 2 es:" + miVariableEntera2);
        System.out.println("mi variable cadena 2 es:" + miVariableCadena2);
        
        //Reglas para definir variables en Java
        //No se pueden utilizar numeros ni ningun caracter especial al principio del nombre mi variable
        //Si puede iniciar con guion bajo, signo de dolar
        var usuario = "Agustin";
        var titulo = "Ingeniero";
        
        var union = titulo + " " + usuario;
        
        System.out.println("union: " + union);*/
        /*
        var a = 8;
        var b = 4;
        
        System.out.println(a + b);
        
        //Ejercicio caracteres especiales en Java
        var nombre = "Rocio";
        System.out.println("Nueva linea: \n"+nombre); //Salto de linea
        System.out.println("Tabulador: \t"+nombre); //tabulador un espacio
        System.out.println("\t\t.:MENÚ:.");
        System.out.println("Retroceso: \b" + nombre); //Caracter de retroceso
        System.out.println("Comillas simples: \'"+nombre+"\'");
        System.out.println("Comillas dobles:\""+nombre+"\"");
        */
        
        //Clase Scanner
        /*
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = "+ usuario2);
        System.out.println("Ingrese un numero: ");
        var numero = entrada.nextInt();
        System.out.println("numero: " + numero);
        */
        /*
        byte numEnteroByte = (byte)129;
        System.out.println("numEnteroByte= "+ numEnteroByte);
        System.out.println("Valor minimo del byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte: "+ Byte.MAX_VALUE);
        
        short numEnteroShort = (short)32768;
        System.out.println("numEnteroShort= "+ numEnteroShort);
        System.out.println("Valor minimo del short: "+ Short.MIN_VALUE);
        System.out.println("Valor maximo del short: "+ Short.MAX_VALUE);
        
        int numEntero = (int)2147483648L;
        System.out.println("numEntero= "+ numEntero);
        System.out.println("Valor minimo del int: "+ Integer.MIN_VALUE);
        System.out.println("Valor maximo del int: "+ Integer.MAX_VALUE);
        
        long numEnteroLong = (long)9223372036854775807L;
        System.out.println("numEnteroLong= "+ numEnteroLong);
        System.out.println("Valor minimo del Long: "+ Long.MIN_VALUE);
        System.out.println("Valor maximo del Long: "+ Long.MAX_VALUE);
        */
        
        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = "+ numFloat);
        System.out.println("El valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("El valor maximo de float: " + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = "+ numDouble);
        System.out.println("El valor minimo de double: " + Double.MIN_VALUE);
        System.out.println("El valor maximo de double: " + Double.MAX_VALUE);
        
        /*
        System.out.println(saludo.equals(saludo2));//retorna false
        
        System.out.println(saludo + saludo2); //Cuando se suman string se concatena
        
        Scanner leerNum = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = leerNum.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = leerNum.nextInt();
        
        resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
        */
    }
}
