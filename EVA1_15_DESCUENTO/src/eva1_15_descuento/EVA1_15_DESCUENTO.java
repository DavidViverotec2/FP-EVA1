package eva1_15_descuento;

import java.util.Scanner;

public class EVA1_15_DESCUENTO {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in); // Cramos el escaner
        double monto; // Se agina la variable para el monto
        
        System.out.print("Ingrese el monto de su venta: "); // Se pide el monto
        monto = entry.nextDouble(); // Se asigna el valor del input o entry al monto con el escaner
        if(monto > 1000){ // Si es monto es mayor a 1000:
            monto = monto * .85; // El nuevo monto va a ser con el descuento
            System.out.print("Con el descuento aplicado el monto queda en: "); // Se imprime un texto de referencia
            System.out.println(monto);} // se imprime el nuevo monto
        else{ // Si no
            System.out.print("El monto es muy poco para aplicar el descuento, el monto es: "); // Se imprime un texto de referencia
            System.out.println(monto);} // Se imprime el monto original
    }
    
}
