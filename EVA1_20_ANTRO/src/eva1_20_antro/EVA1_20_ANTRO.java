package eva1_20_antro;

import java.util.Scanner;

public class EVA1_20_ANTRO {
    // CREAR LAS CONSTANTES
    final static String ACCESO_INE = "1";

    public static void main(String[] args) {
        String credencial;
        int edad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ANTRO EL CARACOLITO");
        System.out.println("  ACCESO AL ANTRO");
        
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        
        // CORRECCIÓN: Limpiar el buffer de entrada después de nextInt()
        entrada.nextLine(); 
        
        System.out.print("Trae su identificacion (1 si la trae): ");
        credencial = entrada.nextLine();
        
        if (edad >= 18) {
            if (credencial.equals(ACCESO_INE)) {
                System.out.println("ADELANTE, PUEDES PASAR");
            } else {
                System.out.println("NO TIENES IDENTIFICACION VALIDA");
            }
        } else {
            System.out.println("ERES MENOR, LO SIENTO");
        }
    }
}