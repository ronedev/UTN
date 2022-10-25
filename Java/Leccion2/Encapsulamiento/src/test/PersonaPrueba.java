
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Agustin", 0, false);
        
        //Modificar a traves de los metodos
        persona1.setNombre("Gaston");
        //Cuando trabajamos con datos encapsulados como nombre en este caso esta es la forma de acceder
        // persona1.nombre = "Gaston"; no se puede porque es privado
        
        //System.out.println("Nombre persona1: " + persona1.nombre);nombre;ERROR
        //Forma correcta:
        System.out.println("Nombre persona1: " + persona1.getNombre());
        System.out.println("Sueldo persona1: " + persona1.getSueldo());
        System.out.println("La persona1 esta eliminada: " + persona1.isEliminado());
        
        //Tarea crear otro objeto de tipo Persona, asignar valores de manera inicial e imprimir, luego modificar los valores y volver a imprimir
        
        Persona personaNueva = new Persona("Julian", -120, true);
        
        System.out.println("Nombre personaNueva: " + personaNueva.getNombre());
        System.out.println("Sueldo personaNueva: " + personaNueva.getSueldo());
        System.out.println("La personaNueva esta eliminada: " + personaNueva.isEliminado());
        
        //Modificamos los valores
        personaNueva.setNombre("Rocio");
        personaNueva.setSueldo(100.000);
        personaNueva.setEliminado(false);
        
        //Utilizamos el metodo toString
        System.out.println(personaNueva.toString());
    }
}
