package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int [3];
        
        edades[0] = 5;
        System.out.println("edades0 = " + edades[0]);
        edades[1] = 10;
        System.out.println("edades1 = " + edades[1]);
        edades[2] = 15;
        System.out.println("edades2 = " + edades[2]);
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("Edades y sus elementos "+i+": " + edades[i]);
        }
    }
}
