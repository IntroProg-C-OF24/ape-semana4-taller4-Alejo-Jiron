/*
Algoritmo_1
Generar un algoritmo que permite calcular y presentar el área de un triángulo. Los datos deben ser pedidos al usuario.
*/
package practica.pkg01.apre.taller.pkg4;
import java.util.Scanner;
public class AreaTriangulo_1 {
    public static void main(String[] args) {
        double baseTriangulo;
        double alturaTriangulo;
        double areaTriangulo;
        Scanner teclado = new Scanner(System.in); //DECLARANDO E INICIALIZAR 
        System.out.println("Ingrese la base del Triangulo");
        baseTriangulo = teclado.nextDouble();
        System.out.println("Ingrese la altura del Triangulo");
        alturaTriangulo = teclado.nextDouble();
        areaTriangulo = (alturaTriangulo * baseTriangulo) /2;
        System.out.println("El area del Triangulo es:" + areaTriangulo);
        //HECHO POR ALEJANDRO JIRON :D
        
    }
    }

