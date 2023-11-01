package practica.pkg01.apre.taller.pkg4;
import java.time.Clock;
import java.util.Scanner;
public class GASTOSdeHIJOS {
    public static void main(String[] args) {
        double gastosHijo1, gastosHijo2, gastosHijo3, gastosTotales;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los gastos del hijo 1: ");
        gastosHijo1 = teclado.nextDouble();
        System.out.println("Ingrese los gastos del hijo 1: ");
        gastosHijo2 = teclado.nextDouble();
        System.out.println("Ingrese los gastos del hijo 1: ");
        gastosHijo3 = teclado.nextDouble();
        gastosTotales = gastosHijo1 + gastosHijo2 + gastosHijo3;
        System.out.println("Los gastos totales de los 3 hijos son: " + gastosTotales );
        
    }
    
}
