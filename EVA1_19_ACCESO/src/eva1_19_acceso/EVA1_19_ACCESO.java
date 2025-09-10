package eva1_19_acceso;

import java.util.Scanner;

public class EVA1_19_ACCESO {
    final static String ACCESO_USU = "DAVID";
    final static String ACCESO_CONTRA = "1234";

    public static void main(String[] args) {
        // Creacion de constantes
        String usuario, contra;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("***** CONTROL DE ACCESO *****");
        System.out.println("BANCO EL AZTECA");
        
        //Captura de datos
        System.out.print("Usuario: ");
        usuario = entrada.nextLine();
        System.out.print("Contraseña: ");
        contra = entrada.nextLine();
        
        // Compara los valores obtenidos de los de las constantes
        if (usuario.equals(ACCESO_USU)){
            if (contra.equals(ACCESO_CONTRA)){
                System.out.println("!! ACCESO PERMITIDO !!");
            } else {
                System.out.println("!! ACCESO DENEGADO (Contraseña incorrecta) !!");
            }
        } else {
            System.out.println("!! ACCESO DENEGADO (Usuario incorrecto) !!");
        }
    }
}