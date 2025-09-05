package eva1_13_if;

import java.util.Scanner;
public class EVA1_13_IF {

    public static void main(String[] args) {
        // Declaracion de variables y scanne
        double calif;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Introduce tu calificacion expresada en 100: ");
        calif = input.nextDouble();
        if (calif >= 70) {  // if solo acepta true o false
            System.out.println("FELICIDADES, ACREDITASTE!!!");
        }else{ // SECCION DE FALSE (NO NECESARIA
            System.out.println("LO SIENTO, NO ACREDITASTE");
        }
    }
}
