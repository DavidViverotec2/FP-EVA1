package eva1_21_errores_comunes;
public class EVA1_21_ERRORES_COMUNES {

    public static void main(String[] args) {
        int num1 = 1,num2 = 2;
        
        if (num1 > num2); // Error termina el if
            System.out.println("Ups, fuera del if");
            
        if (num1 > num2)
            if (num1 > num2)
                System.out.println("Num1 es mayor");
            else // Parece que pertenece al primer if, pero pertenece al segundo
                System.out.println("Num2 es mayor");
        
        if (num1 > num2){
            if (num1 > num2)
                System.out.println("Num1 es mayor");
        }else { // Pertenece al primer if
            System.out.println("Num2 es mayor");}

    }
    
}
