
package test;

import domain.Persona;

public class PersonaPrueba {
    
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Agustin");
        System.out.println("persona1 = " + persona1.toString());
        Persona persona2 = new Persona("Ariel");
        System.out.println("persona2 = " + persona2); //Podemos omitir el toString, lo detecta java
        imprimir(persona1);
        imprimir(persona2);
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println("personaP1 = " + personaP1.getContador());
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Liliana"));
        return this.contador;
    }
}
