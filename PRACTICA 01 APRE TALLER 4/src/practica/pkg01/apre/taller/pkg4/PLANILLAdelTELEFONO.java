/*
Algoritmo 4
Generar un algoritmo que permita calcular y mostrar el valor de la planilla de teléfono de un casa. 
Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes.
*/
package practica.pkg01.apre.taller.pkg4;
import java.util.Scanner;
public class PLANILLAdelTELEFONO {
    public static void main(String[] args) {
        double costoMinutos, minutosConsumidos, planillaTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el costo en minutos");
        costoMinutos = teclado.nextDouble();
        System.out.println("Ingresar los minutos consumidos");
        minutosConsumidos = teclado.nextDouble();
        planillaTotal = costoMinutos * minutosConsumidos;
        System.out.println("La planilla total telefonica es : " + planillaTotal);
        
        
        
    }
    
    
}
