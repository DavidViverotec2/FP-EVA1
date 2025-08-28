package eva1_7_triangulo;

public class EVA1_7_TRIANGULO {

    public static void main(String[] args) {
        //AREA TRIANGULO
        //AREA = (BASE x ALTURA) / 2
        //DECLARACION DE VARAIBLES
        double area,base,altura; // SOLO PORQUE SON DEL MISMO TIPO
        
        //INICIALIZACION
        base = 11;
        altura = 3;
        area = (base * altura) / 2.0; // SE TIENE QUE DIVUDIR EN DECIMAL PARA QUE DE DECIMALES
        
        //IMPRIMIR
        System.out.println("El area de un triangulo con base 10 y altura 8 es: ");
        System.out.println(area);
    }
    
}
