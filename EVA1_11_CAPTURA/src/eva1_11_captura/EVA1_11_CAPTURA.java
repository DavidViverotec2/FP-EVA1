package eva1_11_captura;

import java.util.Scanner;

public class EVA1_11_CAPTURA {

    public static void main(String[] args) {
        // Calculo de velocidad
        // Solicitar distancia (m) y tiempo (s) 
        // Declarar variables y escaner
        double dist,tiempo,vel,velKmH;
        Scanner input = new Scanner (System.in); // Whe create the scanner
        
        //Solicitar datos
        System.out.println("Ingrese la distancia en metros: ");
        dist = input.nextDouble();
        
        System.out.println("Ingrese el tiempo en segundos: ");
        tiempo = input.nextDouble();
        
        //Realizar cálculos
        vel = dist / tiempo;
        
        //Mostrar resultados
        System.out.println("La velocidad calculada en m/s es: ");
        System.out.print(vel);
        System.out.println(" m/s");
        
        // Ademas que lo muestre en km/h
        velKmH = vel * 3.6;
        
        System.out.println("La velocidad calculada en km/h es: ");
        System.out.print(velKmH);
        System.out.println(" km/h");
        
    }
    
}
