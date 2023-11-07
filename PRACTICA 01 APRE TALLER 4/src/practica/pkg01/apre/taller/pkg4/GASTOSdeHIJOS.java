/*
Algoritmo 2 
Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; 
Calcular y mostrar el total de gastos de los hijos del padre de familia.
*/
package practica.pkg01.apre.taller.pkg4;
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
