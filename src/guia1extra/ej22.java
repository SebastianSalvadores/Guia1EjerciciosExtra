/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de filas: ");
        int N = leer.nextInt();
        System.out.println("Ingrese cantidad de columnas: ");
        int M = leer.nextInt();
        int[][] matriz = new int[N][M];
        llenarMatriz(matriz, N, M);
        int suma = sumarMatriz(matriz, N, M);
        System.out.println("La suma de todos los elementos de la matriz es de " + suma);
    }

    public static void llenarMatriz(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static int sumarMatriz(int[][] matriz, int n, int m) {
        int resultado = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultado += matriz[i][j];
            }
        }
        return resultado;
    }
}
