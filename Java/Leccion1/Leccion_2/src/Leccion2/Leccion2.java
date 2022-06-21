package Leccion2;

import java.util.Scanner;

public class Leccion2 {
    public static void main(String[] args) {
        /*
        var condicion = false;
        if(condicion)
            System.out.println("Condicion verdadera");
        else
            System.out.println("Condicion falsa");
        
        var numero = 7;
        var numeroTexto = "numero desconocido";
        if(numero == 1){
            numeroTexto = "numero uno";
        }else if(numero ==2){
            numeroTexto = "numero dos";
        }else if (numero == 3){
            numeroTexto = "numero tres";
        }else if(numero == 4){
            numeroTexto = "numero cuatro";
        }else{
            numeroTexto = "numero no encontrado";
        }
        
        System.out.println(numeroTexto);*/
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite un numero del 1 al 4: ");
        var num = Integer.parseInt(input.nextLine());
        
        var numeroTexto = "Valor desconocido";
        
        switch(num){
            case 1:
                numeroTexto = "numero uno";
                break;
            case 2:
                numeroTexto = "numero dos";
                break;
            case 3:
                numeroTexto = "numero tres";
                break;
            case 4:
                numeroTexto = "numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
                break;
        }
        System.out.println("numeroTexto = " + numeroTexto);        
    }
    
}
