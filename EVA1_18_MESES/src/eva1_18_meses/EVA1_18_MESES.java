package eva1_18_meses;

import java.util.Scanner;

public class EVA1_18_MESES {

    public static void main(String[] args) {
        int mes;
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Inserte el dia de mes (1-12): ");
        mes = entrada.nextInt();
        
        
        if (mes == 1){
            System.out.println("ENERO");}
        else if (mes == 2){
            System.out.println("FEBRERO");}
        else if (mes == 3) {
            System.out.println("MARZO");}
        else if (mes == 4) {
            System.out.println("ABRIL");}
        else if (mes == 5) {
            System.out.println("MAYO");}
        else if (mes == 6) {
            System.out.println("JUNIO");}
        else if (mes == 7) {
            System.out.println("JULIO");}
        else if (mes == 8) {
            System.out.println("AGOSTO");}
        else if (mes == 9) {
            System.out.println("SEPTIEMBRE");}
        else if (mes == 10) {
            System.out.println("OCTUBRE");}
        else if (mes == 11) {
            System.out.println("NOVIEMBRE");}
        else if (mes == 12) {
            System.out.println("DICIEMBRE");}
        else {
            System.out.println("Este dia del mes no es valido");}
    }
    }
 
