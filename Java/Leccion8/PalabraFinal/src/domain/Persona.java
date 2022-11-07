package domain;

//public final class Persona {
public class Persona{
    public final static int CONSTANTE_AQUI = 15;
    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimir(){
        System.out.println("No se puede modificar desde las clases hijas");
    }
}
