package eva_16_numero_mayor;

import java.util.Scanner;

public class EVA_16_NUMERO_MAYOR {

    public static void main(String[] args) {
        double num1,num2; // Creamos las valiables para los numeros
        Scanner input = new Scanner (System.in); // Creamos el escaner
        
        System.out.print("Ingrese el primer numero: "); // Indicamos una instruucion
        num1 = input.nextDouble(); // Guardamos el resultado en la variable
        System.out.print("Ingrese el segundo numero: ");
        num2 = input.nextDouble();
        
        if (num1 > num2){ // Si el numero 1 es mayor que el 2:
            System.out.print("El primer numero es mayor: ");
            System.out.println(num1);} // Imprimimos el numero mas grande
        else{ // Nos queda que si num1 < num2 o num1 == num2:
            if (num1 < num2){ // Este es un if anidado, si el 2 es mayor:
                System.out.print("El segundo numero es mayor: ");
                System.out.println(num2);
            } else { // Aqui solo queda que sean iguales
                System.out.println("Los numeros son iguales");}
        }
        
    }  
    
}
