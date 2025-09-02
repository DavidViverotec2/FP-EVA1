package eva1_9_captura;

import java.util.Scanner;

public class EVA1_9_CAPTURA {

    public static void main(String[] args) {
        String nombre;
        int edad;
        double prom;
        Scanner input = new Scanner(System.in); // Here we create the sacnner
        
        
       
        System.out.println("Introduzca su nombre completo: ");
        nombre = input.nextLine(); // Capture the text
        
        System.out.println("Introduzca su edad: ");
        edad = input.nextInt(); // Depends of the tipe of the variable
        
        System.out.println("Introduzca su promedio: ");
        prom = input.nextDouble();
       // You can use the same scanner for all
        
       //  How capture in Java
       
       
       System.out.println("El nombre capturado es: ");
       System.out.println(nombre);
       
       System.out.println("La edad capturada es: ");
       System.out.println(edad);
       
       System.out.println("El promedio capturado es: ");
       System.out.println(prom);
    }
    
}
