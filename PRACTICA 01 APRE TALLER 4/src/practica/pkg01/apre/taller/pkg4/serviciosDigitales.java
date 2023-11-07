/*
 Algoritmo-8
Se debe generar un algoritmo que permite calcular y mostrar el valor total a pagar mensual de servicios digitales de una persona. 
Los servicios digitales son: netflix, youtube premium, dropbox, spotify. Si la persona es menor a 30 años se descuenta el 20% del total mensual
*/
package practica.pkg01.apre.taller.pkg4;
import java.util.Scanner;
public class serviciosDigitales{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double varl1, varl2, varl3, varl4, varl5, varl6, varl7;
        System.out.println("Ingresa el costo de Netflix");
        varl1 = teclado.nextDouble();
        System.out.println("Ingresa el costo de Youtube Premium");
        varl2 = teclado.nextDouble();
        System.out.println("Ingresa el costo de Dropbox");
        varl3 = teclado.nextDouble();
        System.out.println("Ingresa el costo de Spotify");
        varl4 = teclado.nextDouble();
        System.out.println("Ingresa tu edad");
        varl6 = teclado.nextDouble();
        varl5 = varl1 + varl2 + varl3 + varl4;
        if (varl6 < 30) {
            varl7 = (varl5 * 30/100);
            varl5 = varl5 - varl7;
            System.out.println("El valor total a pagar es" + " " + varl5);
        }
        else {
            System.out.println("El valor total a pagar es" + " " + varl5);
        }
    }   
}
