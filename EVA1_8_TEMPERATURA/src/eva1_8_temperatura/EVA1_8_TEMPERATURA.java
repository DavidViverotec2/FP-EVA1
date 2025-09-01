package eva1_8_temperatura;

public class EVA1_8_TEMPERATURA {

    public static void main(String[] args) {
        // CREACION DE VARIABLES
        double faren,celsius,kelvin;
        
        // ASIGNACION 
        faren = 100;
        celsius = (5*(faren-32))/9;
        
        kelvin = celsius + 273.5;
        
        faren = ((9 * celsius)/5)+32;
        
        System.out.print("100 Grados Fahrenheit en Celsius son: ");
        System.out.println(celsius);
        
        System.out.print("37.77 grados celsius  en Kelvin son: ");
        System.out.println(kelvin);
        
        System.out.print("37.77 grados celsius en fahrenheit son: ");
        System.out.println(faren);
        
        
    }
    
}
