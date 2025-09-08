package eva_16_numero_mayor;

import java.util.Scanner;

public class EVA_16_NUMERO_MAYOR {

    public static void main(String[] args) {
        double num1,num2;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Ingrese el primer numero: ");
        num1 = input.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        num2 = input.nextDouble();
        
        if (num1 > num2){
            System.out.print("El primer numero es mayor: ");
            System.out.println(num1);}
        else{
            System.out.print("El segundo numero es mayor: ");
            System.out.println(num2);}
        
    }  
    
}
