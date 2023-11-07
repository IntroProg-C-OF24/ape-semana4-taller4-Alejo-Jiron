/*
Algoritmo 7
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla de luz. Se debe
ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario
tiene edad mayor a 65 años, se debe descontar el 10%.
*/
package practica.pkg01.apre.taller.pkg4;
import java.util.Scanner;
public class ValorDeLaPlanullaDeLuz {
    public static void main(String[] args) {
        Scanner Respuesta = new Scanner(System.in);
        double varl1, verl2, varl3, varl4, varl5;
        System.out.println("Dame el valor del costo por Kilovatio/hora");
        varl1 = Respuesta.nextDouble();
        System.out.println("Dame el valor de los kilovatios consumidos en el mes");
        verl2= Respuesta.nextDouble();
        System.out.println("Dame tu edad");
        varl3 = Respuesta.nextDouble();
        varl4 = varl1*verl2;
        if (varl3 >= 65) {
            varl5 = varl4*10/100;
            varl4 = varl4 - varl5;
            System.out.println("El valor de la planilla es:" + " " + varl4);  
        }
        else {
            System.out.println("El valor de la planilla es" + " " + NutriaCamicasi);
        }
    }   
}
