/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N, suma;
        System.out.println("Ingrese tamaño del vector: ");
        N = leer.nextInt();
        int[] vector = new int[N];
        llenarVector(vector, N);
        suma = sumarElementos(vector, N);
        System.out.println("La suma de todos los elementos del vector es de " + suma);
    }

    public static void llenarVector(int[] vector, int N) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese elemento en la posición " + (i + 1) + ":");
            vector[i] = leer.nextInt();
        }
    }

    public static int sumarElementos(int[] vector, int N) {
        int suma = 0;
        for (int i = 0; i < N; i++) {
            suma += vector[i];
        }
        return suma;
    }

}
