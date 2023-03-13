/*
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:

1, 1, 2, 3, 5, 8, 13, 21, 34, ...

Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)

Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…

La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2) para todo (n>1)
Fibonacci(n) = 1 para todo (n<=1)

Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
https://quantdare.com/numeros-de-fibonacci/
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingrese valor de N para una sucesión de Fibonacci: ");
        N = leer.nextInt();
        int[] vector = new int[N];
        llenarVector(vector, N);
        imprimirVector(vector, N);
    }

    public static void llenarVector(int[] vector, int N) {
        for (int i = 0; i < N; i++) {
            vector[i] = Fibonacci(i);
        }
    }

    public static void imprimirVector(int[] vector, int N) {
        System.out.println("La sucesion de Fibonacci(" + N + ") es:");
        for (int i = 0; i < N; i++) {
            System.out.print("[" + vector[i] + "]");
        }
    }

    public static int Fibonacci(int n) {
        int retorno = 0;
        if (n <= 1) {
            retorno = 1;
        } else if (n > 1) {
            retorno = Fibonacci(n - 1) + Fibonacci(n - 2);
        }
        return retorno;
    }
}

//TEST DE RAMA GIT