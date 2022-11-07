package domain;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; //Para incrementar
    
    //Contructor1
    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }
    
    //Constructor2
    public Empleado(String nombre, double sueldo) {
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //Getters and Setters
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
