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
<<<<<<< HEAD
        double bookPrice = Double.parseDouble(input.nextLine());
=======
        int bookPrice = Integer.parseInt(input.nextLine());
>>>>>>> 016cb2a8486c3240ea97f54eeb9f59591449805b
        
        System.out.println("¿El envio es gratuito? ");
        boolean bookDelivery = Boolean.parseBoolean(input.nextLine());
        
        System.out.println(bookName + " /"+bookID);
<<<<<<< HEAD
        System.out.println("Precio del libro: $"+ bookPrice);
=======
        System.out.println("Precio del libro: "+ bookPrice);
>>>>>>> 016cb2a8486c3240ea97f54eeb9f59591449805b
        System.out.println("El envio es gratuito: " + bookDelivery);
    }
}
