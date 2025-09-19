package eva1_28_moneda;

import java.util.Scanner;

public class EVA1_28_MONEDA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int usuario;
        
        System.out.print("Elige aguila o sello (1/2): ");
        usuario = entrada.nextInt();
        
        int numero;
        
        if (Math.random() < 0.50) {
            System.out.println("        Aguila");
            numero = 1;
        }else {
            System.out.println("        Sello");
            numero = 2;
        }
        
        if (usuario == numero) {
            System.out.println("!!! FELICIDADES LE ATINASTE !!!");
        }else {
            System.out.println("!!! NO LE ATINASTE !!!");}
        
    }
    
}
