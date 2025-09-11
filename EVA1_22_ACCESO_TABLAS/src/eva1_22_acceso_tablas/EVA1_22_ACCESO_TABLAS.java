package eva1_22_acceso_tablas;

import java.util.Scanner;

public class EVA1_22_ACCESO_TABLAS {
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
        
        // OPERADOR AND (Y)
        if (usuario.equals(ACCESO_USU) && contra.equals(ACCESO_CONTRA))
            System.out.println("ACCESO CONCEDIDO!!");
        else 
            System.out.println("ACCESO DENEGADO!!");
    }
}