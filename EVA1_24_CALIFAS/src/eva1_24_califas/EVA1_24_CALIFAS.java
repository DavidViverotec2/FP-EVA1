package eva1_24_califas;

import java.util.Scanner;

public class EVA1_24_CALIFAS {

    public static void main(String[] args) {
        int califa;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Calificaciones Finales");
        System.out.print("Ingrese su calificacion: ");
        califa = entrada.nextInt();
        
        if (califa >= 90 && califa <= 100) {
            System.out.println("!!!Felicidades, Sacaste una A!!!");}
        else if (califa >= 80 && califa <= 89) {
                    System.out.println("Felidades, Sacaste una B");}
        else if (califa >= 70 && califa <= 79) {
            System.out.println("Sacaste una C, Puedes mejorar");}
        else if (califa >= 60 && califa <= 69) {
            System.out.println("Sacaste una D, Puedes mejorar");}
        else if (califa >= 0 && califa <= 59) {
            System.out.println("Sacaste una F, Puedes mejorar");}
    }
    
}
