package Operaciones;

public class Aritmetica {
    //Atributos
    int a;
    int b;
    
    //El constructor es un metodo especial
    public Aritmetica(){
        System.out.println("Se ejecuta el constructor 1");
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Se ejecuta el constructor 2");
    }
    
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
        this.a = num1;
        this.b = num2;
        //return a + b;
        return this.sumarConRetorno();
    }
}
