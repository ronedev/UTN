package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite el nombre del libro: ");
        String bookName = input.nextLine();
        
        System.out.println("Digite el id del libro: ");
        int bookID = Integer.parseInt(input.nextLine());
        
        System.out.println("Digite el precio del libro: ");
        int bookPrice = Integer.parseInt(input.nextLine());
        
        System.out.println("¿El envio es gratuito? ");
        boolean bookDelivery = Boolean.parseBoolean(input.nextLine());
        
        System.out.println(bookName + " /"+bookID);
        System.out.println("Precio del libro: "+ bookPrice);
        System.out.println("El envio es gratuito: " + bookDelivery);
    }
}
