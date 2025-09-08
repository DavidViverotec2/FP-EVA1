package eva1_14_if_votar;

import java.util.Scanner;
public class EVA1_14_IF_VOTAR {

    public static void main(String[] args) {
        // Declaracion de variables y scanner
        int edad,nac; // Se crea la varibale para la edad y para el año de nacimiento
        Scanner entry = new Scanner (System.in); // Se crea un escaner llamado entry
        
        System.out.println("Introduce tu año de nacimiento: ");// Se imprime la solicitud año de nacimiento
        nac = entry.nextInt(); // Se dice que en nac se guardara los datos recibidos del escaner
        edad = 2025 - nac; // Se dice que la edad es el año actual menos el año de nacimiento
        if (edad >= 18) { // Si el valor en edad es mayor o igual a 18 haz lo siguiente
            System.out.println("ERES MAYOR, PUEDES VOTAR"); // Imprime el resultado
        }else{ // Si el valor en edad es menor a 18, haz lo siguiente
            System.out.println("ERES MENOR, NO PUEDES VOTAR"); // Imprime el resultado
        }
    }
}
