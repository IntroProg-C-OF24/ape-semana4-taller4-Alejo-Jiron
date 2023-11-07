/*
algoritmo 9
El programa debe calcular el área del polígono. 
La figura se compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, E), 
cuya base mide lo mismo que uno de los lados del cuadrado, y un rectángulo cuyo ancho mide lo mismo 
que uno de los lados del cuadrado mientras que la altura mide lo mismo que la altura de los triángulos. 
Se pide que haga un programa que calcule el área total.

Por cultura general, sabemos que el área de un rectángulo se calcula multiplicando su base por su altura; 
El área de un triángulo rectángulo se calcula multiplicando su base por su altura
y luego dividiendo el resultado entre dos; 
Finalmente, el área de un cuadrado se calcula elevando al cuadrado la medida de uno de sus lados.

La parte interesante de este problema es determinar el mínimo número de datos que hay que preguntar.
*/
 
package practica.pkg01.apre.taller.pkg4;
import java.util.Scanner;
public class AreaPoligono{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double varl1, varl2, varl3, varl4, varl5;
        System.out.println("Ingresa el valor de un lado del cuadrado");
        varl1 = teclado.nextDouble();
        System.out.println("Ingresa el valor de la altura del triangulo");
        varl2 = teclado.nextDouble();
        varl3 = ((varl1*varl2)/2)*5;
        varl4 = varl1*varl1;
        varl5 = varl3 + varl4;
        System.out.println("El area del poligono es:" + " " + varl5);
    }   
}