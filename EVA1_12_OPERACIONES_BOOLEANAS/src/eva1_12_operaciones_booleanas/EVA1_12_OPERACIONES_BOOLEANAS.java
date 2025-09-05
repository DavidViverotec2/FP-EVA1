package eva1_12_operaciones_booleanas;

public class EVA1_12_OPERACIONES_BOOLEANAS {

    public static void main(String[] args) {
        int radio = 5; //Declaro e inicializo
        boolean resu; // true false
        // Uso de operadores booleanos
        
        resu = radio < 0; // false
        System.out.print("Radio (5) < 0 es: ");
        System.out.println(resu);
        
        resu = radio > 0; // true
        System.out.print("Radio (5) > 0 es: ");
        System.out.println(resu);
        
        resu = radio == 0; // false porque es una comparacion
        System.out.print("Radio (5) = 0 es: ");
        System.out.println(resu);
        
        resu = radio != 0; // true porque es diferente
        System.out.print("Radio (5) != 0 es: ");
        System.out.println(resu);
    }
    
}
