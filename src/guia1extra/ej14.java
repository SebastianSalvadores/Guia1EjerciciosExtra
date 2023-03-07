/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familias, hijos, edad, cont = 0;
        float media = 0;
        System.out.println("Ingrese cantidad de familias:");
        familias = leer.nextInt();
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese cantidad de hijos de la familia " + (i + 1));
            hijos = leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese edad del hijo/a " + (j + 1));
                edad = leer.nextInt();
                media += edad;
                cont++;
            }
        }
        media /= cont;
        System.out.println("La media de edad de los hijos de todas las familias es de " + media);
    }
}
