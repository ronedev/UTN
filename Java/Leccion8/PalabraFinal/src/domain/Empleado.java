
package domain;

//No puede extender de la clase Persona porque es final

public class Empleado extends Persona {
    @Override
    public void imprimir(){
        System.out.println("No se puede sobreescribir el metodo de la clase persona desde esta calse hija");
    }
}
