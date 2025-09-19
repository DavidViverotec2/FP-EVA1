package eva1_25_bisiesto;

import java.util.Scanner;


public class EVA1_25_BISIESTO {
    
    public static void main(String[] args) {
        int año,res1;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Verificacion de año bisiesto");
        System.out.print("Ingrese el año a verificar: ");
        año = entrada.nextInt();
        
        res1 = año % 4;


        if (res1 == 0){ // Division exacta sin residuos
            res1 = año % 100; // Se reasigna res1 ahora con el residuo de la division exacta de 100
            if (res1 == 0 ) { // Si el residuo nuevo es exactamente 0:
                res1 = año % 400; // Se reasigna res1 ahora con el residuo de la division exacta de 400
                if (res1 == 0) { // Si el residuo nuevo es exactamente 0:
                    System.out.println("!!! EL AÑO " + año + " ES BISIESTO!!!"); // Significa que el año es dividible entre 4, entre 100 y entre 400
                }else { // Este año es divisible / 4, /100 pero no /400
                    System.out.println("!!! EL AÑO " + año + "NO ES BISIESTO !!!");}}
            else { // Este año es divisible /4, pero no /100 asi que es bisiesto
                System.out.println("!!! EL AÑO " + año + " ES BISIESTO !!!");}
        }
        else { // Este año no es divisible /4, asi que no es bisiesto
            System.out.println("!!! EL AÑO " + año + " NO ES BISIESTO !!!");}
    }

}
