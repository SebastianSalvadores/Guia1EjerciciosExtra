/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = devolverVector();
        rellenarVector(vector);
        imprimirVector(vector);

    }

    public static int[] devolverVector() {
        int[] vector = new int[6];
        return vector;
    }

    public static void rellenarVector(int[] vector) {
        for (int i = 0; i < 6; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < 6; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
}
