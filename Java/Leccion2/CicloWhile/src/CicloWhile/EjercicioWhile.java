package CicloWhile;

public class EjercicioWhile {
    public static void main(String[] args) {
        var contador = 0; //Inferencia de tipos
        while(contador <= 7){
            System.out.println("contador = " + contador);
            contador++;
        }
        
        var indice = 0;
        do{
            System.out.println("indice = " + indice);
            indice++;
        }while(indice < 4);
        
        for(var i = 3; i <= 5; i++){
            System.out.println("i = " + i);
        }
    }
}
