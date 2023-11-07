/*
Algoritmo 3
Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar de un número ingresado por
el usuario; solo en el caso que el valor del número esté entre 2 y 6.
*/
package practica.pkg01.apre.taller.pkg4;
import java.util.Scanner;
public class TablaDeMultiplicar {
        public static void main(String[] args) {
        double numero1;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el primer numero entre 2 y 6");
        numero1 = teclado.nextDouble();
            System.out.println("Tabla presentada: ");
            for (int i = 1; i <=10; i++) {
                System.err.println(numero1 * i);
            }
    }
    
}
