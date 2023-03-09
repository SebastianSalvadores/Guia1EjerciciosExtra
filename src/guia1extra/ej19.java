/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vec1 = {9, 1, 2, 1, 8};
        int N;
        boolean iguales;
        System.out.println("Ingrese tamaño del vector: ");
        N = leer.nextInt();
        if (N != vec1.length) {
            System.out.println("Los vectores son de distino tamaño.");
        } else {
            int[] vec2 = new int[N];
            llenarVector(vec2, N);
            iguales = compararVectores(vec1, vec2, N);
            if (iguales) {
                System.out.println("Los vectores son iguales.");
            } else {
                System.out.println("Los vectores son distintos.");
            }
        }
    }

    public static void llenarVector(int[] vector, int N) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese elemento en la posicion " + (i + 1) + ":");
            vector[i] = leer.nextInt();
        }
    }

    public static boolean compararVectores(int[] vec1, int[] vec2, int N) {
        boolean iguales = true;
        for (int i = 0; i < N; i++) {
            if (vec1[i] != vec2[i]) {
                iguales = false;
                break;
            }
        }
        return iguales;
    }
}
