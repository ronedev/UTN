
package dominio;

public class Persona {
    //Atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    public String getNombre(){
        return nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public boolean isEliminado(){
        return eliminado;
    }
    
    public void setNombre(String name){
        this.nombre = name;
        System.out.println("Nuevo nombre = " + this.nombre);
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
        System.out.println("Nuevo sueldo = " + this.sueldo);
    }
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
        System.out.println("Nuevo estado de eliminado = " + this.eliminado);
    }
    
    public String toString(){//Convierte en una cadena cada atributo
        return "Persona [nombre: " + this.nombre + ", sueldo: " + this.sueldo + ", esta eliminado: " + this.eliminado + "]";
    }
}
