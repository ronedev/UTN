package Operaciones;

public class Aritmetica {
    //Atributos
    int a;
    int b;
    
    //Metodos
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        int resultado = a + b;
        return resultado;
    }
    
    public int sumarConArgumentos(int num1, int num2){
        a = num1;
        b = num2;
        //return a + b;
        return sumarConRetorno();
    }
}
