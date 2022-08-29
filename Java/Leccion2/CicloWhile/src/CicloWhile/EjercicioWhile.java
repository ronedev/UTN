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
        
        //Uso de break y continue con las etiquetas (labels)
        
        for(var i = 3; i <= 5; i++){
            if(i % 2 == 0){
                System.out.println("i = " + i);
                break;
            }
        }
        
        inicio:
        for(var i = 0; i <= 5; i++){
            if(i % 2 != 0){
                continue inicio;
            }
            System.out.println("i = " + i);
        }
    }
}
