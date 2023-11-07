/*
Algoritmo 5
Generar un algoritmo que permita calcular y mostrar el costos de una computadora de escritorio. 
La misma es comprada por partes; CPU, teclado, pantalla, ratón
*/
package practica.pkg01.apre.taller.pkg4;
import java.util.Scanner;
public class CostoDeLaComputadora {
    public static void main(String[] args) {
        double CostoCPU, CostoTECLADO, CostoPANTALLA, CostoRATON, CostoTotalC;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("INGRESE EL COSTO DEL CPU: ");
        CostoCPU = Teclado.nextDouble();
        System.out.println("INGRESE EL COSTO DEL TECLADO: ");
        CostoTECLADO = Teclado.nextDouble();
        System.out.println("INGRESE EL COSTO DE LA PANTALLA: ");
        CostoPANTALLA = Teclado.nextDouble();
        System.out.println("INGRESE EL COSTO DE EL RATON: ");
        CostoRATON = Teclado.nextDouble();
        CostoTotalC = CostoCPU + CostoPANTALLA + CostoTECLADO + CostoRATON;
        System.out.println("EL COSTO TOTAL DE LA COMPUTADORA ES: " + CostoTotalC);
    }
    
}
