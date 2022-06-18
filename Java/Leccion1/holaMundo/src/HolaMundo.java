
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
        
        /*float numFloat = 3.4028235E38F;
        System.out.println("numFloat = "+ numFloat);
        System.out.println("El valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("El valor maximo de float: " + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = "+ numDouble);
        System.out.println("El valor minimo de double: " + Double.MIN_VALUE);
        System.out.println("El valor maximo de double: " + Double.MAX_VALUE);*/
        
        //Inferencia de tipos var y tipos primitivos
        /*var numEntero = 20; //Las literales sin punto automaticamente don de tipo int
        System.out.println("numEntero = "+ numEntero);
        
        var numDouble = 10.0; //Automaticamente con el punto se transforma en tipo double
        System.out.println("numFloat= " + numDouble);
        //Para que la inferencia de tipo tome a un numero con punto como float hay que ponerle la letra F
        var numFloat = 10.0F; //Automaticamente con el punto se transforma en tipo double
        System.out.println("numFloat= " + numFloat);*/
        
        //Tipos primitvos char
        /*char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //Valor decimal del jeugo de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$';//Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        var varCaracter1 = '\u0024'; //Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter1);
        var varCaracterDecimal1 = 36; //Valor decimal del jeugo de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$';//Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);*/
        
        //Tipos primitivos tipos booleanos
        /*boolean varBool= true;
        System.out.println("varBool = " + varBool);
        
        if(varBool){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
        
        //Es mayor de edad
        var edad = 30;
        var adulto = edad >= 18;
        
        if(adulto){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }*/
        
        //Conversiones de tipos primitivos
        /*var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir valor
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad: ");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad);*/
        
        //conversion de tipos primitivos en Java parte 2
        /*var entrada = new Scanner(System.in);
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + (edadTexto+1));
        
        var fraseChar = "programadores".charAt(3);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);*/
        
        /*
        int num1 = 5, num2 = 4;
        var solucion = num1 +num2;
        System.out.println("solucion de la suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion de la division = " + solucion );
        
        var solucion2 = 3.14 / num2;
        System.out.println("solucion de la division = " + solucion2);
        
        solucion = num1 % num2;
        System.out.println("solucion del modulo = " + solucion);
        
        if(num1 % 2 == 0){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero impar");
        }*/
        /*
        int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2; //Operacion
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1; //varNum1 = varNum1 + 1
        System.out.println("suma = " + varNum1);
        
        varNum1 -= 3; //varNum1 = varNum1 - 3
        System.out.println("resta= " + varNum1);
        
        varNum1 *= 2; //varNum1 = varNum1 * 2
        System.out.println("multiplicacion = " + varNum1);
        
        varNum1 /= 4; //varNum1 = varNum1 / 4
        System.out.println("division= " + varNum1);
        
        varNum1 %= 2; //varNum1 = varNum1 % 2
        System.out.println("modulo = " + varNum1);*/
        
        /*
        //Operadores unarios: cambio de signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        
        //Operador de negacion
        var varC = true;
        var varD = !varC;
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadores unarios de incremento: Preincremento
        var varE = 9;
        System.out.println("varE = " + varE);

        var varF = ++varE;
        System.out.println("varF = " + varF);
        
        //Operadores unarios de incrmento: Postincremento
        var varG = 3;
        System.out.println("varG = " + varG);
        var varH = varG++;
        System.out.println("varG = " + varG);//El incremento se aplica pero no se guarda en varH sino en varG
        System.out.println("varH = " + varH);
        
        //Operadores unarios de decremento predecremento
        var varI = 4;
        System.out.println("varI = " + varI);
        var varJ = --varI;
        System.out.println("varJ = " + varJ);
        //Postdecremento
        var varK =5;
        System.out.println("varK = " + varK);
        var varL = varK--;
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);*/
        
        //Operadores de igualdad y relacionales
        /*
        var aNum = 5;
        var bNum = 5;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB = "Hello";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
        var gVar = aNum >= bNum;
        System.out.println("gVar = " + gVar);
        
        if(aNum % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("impar");
        }
        
        var edad = 30;
        var adulto = 18;
        
        if(edad >= adulto){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }*/
        
        //Operadores condicionales
        /*
        var valorA = 15;
        var valorMin = 0;
        var valorMax = 10;
        var respuesta = valorA >= valorMin && valorA <= valorMax;
        
        if(respuesta){
            System.out.println("Dentro del rango");
        }else{
            System.out.println("Fuera del rango");
        }
        
        var vacaciones = false;
        var diaLibre = true;
        
        if(vacaciones || diaLibre){
            System.out.println("Puedo ir al partido");
        }else{
            System.out.println("No puedo ir al partido");
        }*/
        
        //Operador ternario
        /*
        var resultadoT = (5<6) ? "Verdadero" : "falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 5;
        resultadoT = numeroT % 2 == 0 ? "Par" : "Impar";
        System.out.println("resultadoT = " + resultadoT);*/
        
        //Prioridad de los operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);//6
        System.out.println("y = " + y);//9
        System.out.println("z = " + z);//16
        
        var solucionAritmetica = 4 + 5 * 6 /3; //4 + ((5*6)/3) = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        solucionAritmetica = (4+5) * 6 / 3; // ((4+5)*6)/3 = 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        
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
