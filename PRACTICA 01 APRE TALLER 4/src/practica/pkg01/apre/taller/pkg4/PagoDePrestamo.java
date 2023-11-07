/*Algoritmo 6
Generar una solución que permita calcular y mostrar el pago mensual de un préstamo de 1 año de plazo. Se
debe ingresar el monto del préstamo y el interés mensual a cobrar.
*/
package practica.pkg01.apre.taller.pkg4;
import java.util.Scanner;
public class PagoDePrestamo {
    public static void main(String[] args) {
        double MontoDelprestamo, MontoDelInteres, PagoMensual;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESAR EL MONTO DEL PRESTAMO QUE QUIERA CALCULAR MENSUALMENTE: ");
        MontoDelprestamo = teclado.nextDouble();
        System.out.println("INGRESAR EL MONTO DE INTERES: ");
        MontoDelInteres = teclado.nextDouble();
        PagoMensual = (MontoDelprestamo)/12 + MontoDelInteres;
        System.out.println("El pago mensual con intereses del prestamo anual es: " + PagoMensual); 
    }
    
}
