package eva1_26_operaciones;

public class EVA1_26_OPERACIONES {

    public static void main(String[] args) {
        // Divisiones
        int val1 = 7, val2 = 3;
        int resu;
        resu = val1 / val2;
        System.out.print("7 / 3 = ");
        System.out.println(resu);
        
        double v1 = 7.0, v2 = 3.0;
        double res;
        res = v1 / v2;
        System.out.print("7.0 / 3.0 = ");
        System.out.println(res);
        
        int num1 = 2025, num2 = 4;
        int resi;
        resi = num1 % num2;
        System.out.print("Residuo de 2024 % 4 = ");
        System.out.println(resi);
        if (resi == 0){ // Division exacta entre 4
            System.out.println("Puede ser año bisiesto");}
    }
    
}
