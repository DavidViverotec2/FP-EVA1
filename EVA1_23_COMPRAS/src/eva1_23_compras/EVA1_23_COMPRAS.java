package eva1_23_compras;

import java.util.Scanner;

public class EVA1_23_COMPRAS {

    public static void main(String[] args) {
        String credito,efectivo;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("          TIENDA EL SOSPECHOSO");
        System.out.println("   VERIFIQUE SI PUEDE COMPRAR AQUI");
        System.out.print("Ingrese si cuenta con credito (si o no): ");
        credito = entrada.nextLine();
        System.out.print("Ingrese si cuenta con  efectivo (si o no): ");
        efectivo = entrada.nextLine();
        
        if (credito.equals("si") || efectivo.equals("si"))
            System.out.println("!!USTED PUEDE COMPRAR EN NUESTRA TIENDA!!");
        else
            System.out.println("!!! lO SIENTO, NO PUEDES COMPRAR EN NUESTRA TIENDA!!!");
    }
    
}
