/*
Uso de la palabra reservada Final
Tiene diferentes significados dependiendo donde se aplique
variables: evita cambiar el valor que almacena la variable
metodos: evita que se modifique la definicion o comportamiento de un metodo desde una clase hija o subclase
clases: evita que se creen clases hijas
Otra caracteristica es que normalmente cuando trabajamos con variables se convina junto 
al modificador de acceso estatico para convertir una variable en una constante,
es decir que no se puede modificar su valor, el ejemplo de esto es la clase Math en la cual 
todos sus atributos son de tipo static y final, es por esto que la variable pi se conoce como una constante
*/

package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDNI = 20452871;
        System.out.println("miDNI = " + miDNI);
        //miDNI = 42063877;
        //Persona.CONSTANTE_AQUI = 12; //No se puede modificar al ser estatico y final a la vez
        System.out.println("Persona.CONSTANTE_AQUI = " + Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona(); // Aunque la clase Persona no tenga constructor se crea uno vacio
        //persona1 = new Persona(); No se puede asignar una nueva referencia
        persona1.setNombre("Agustin");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
    }
}
