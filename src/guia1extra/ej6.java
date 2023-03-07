/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N, cont1 = 0;
        double estatura, prom1 = 0, prom2 = 0;
        System.out.println("Ingrese cantidad de personas:");
        N = leer.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese estatura de la persona " + (i + 1) + ":");
            estatura = leer.nextDouble();
            if (estatura <= 1.6) {
                prom1 += estatura;
                cont1++;
            }
            prom2 += estatura;
        }
        prom1 = prom1 / cont1;
        prom2 = prom2 / N;
        System.out.println("El promedio general es de: " + prom2 + " y el promedio de personas por debajo de 1.60 es de: " + prom1);
    }
}
