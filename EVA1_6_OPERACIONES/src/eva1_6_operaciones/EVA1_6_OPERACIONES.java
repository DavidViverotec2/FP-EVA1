package eva1_6_operaciones;

public class EVA1_6_OPERACIONES {

    public static void main(String[] args) {
        // Declaracion de variables
        double area;
        double radio;
        double pi;
        
        // Inicializacion
        pi = 3.1416;
        radio = 5;
        area = pi * radio *radio;
        
        //Imprimir
        System.out.print("El area de un circulo de 5 de radio es: ");
        System.out.println(area);
        
        radio = 100;
        area = pi * radio * radio;
        System.out.println("El area de un circulo de 100 de radio es: ");
        System.out.println(area);
    }
    
}
