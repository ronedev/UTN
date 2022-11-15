package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[3];
        personas[0] = new Persona("Agustin");
        personas[1] = new Persona("Ariel");
        personas[2] = new Persona("Juanjo");
        
        System.out.println("personas = " + personas[0] +", "+ personas[1]+ " y "+ personas[2]);
    
        for(int i = 0; i < personas.length; i++){
            System.out.println("personas["+ i +"] = " + personas[i]);
        }
        
        String frutas[] = {"banana", "pera", "durazno"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas["+ i +"] = " + frutas[i]);
        }
    }
}
