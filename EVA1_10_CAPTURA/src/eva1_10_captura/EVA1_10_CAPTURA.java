package eva1_10_captura;

import java.util.Scanner;

public class EVA1_10_CAPTURA {

    public static void main(String[] args) {
        // Solicitar la temperatura en fahrenheit
        Scanner input = new Scanner(System.in);
        double far, cent;
        // Capturar
        System.out.println("Ingrese la temperatura en fahrenheit: ");
        far = input.nextDouble();
        
        // Regresar la temperatura en grados centigrados
        cent = (5*(far-32))/9;
        System.out.println("La temperatura en grados celsius es: ");
        System.out.println(cent);
    }
    
}
