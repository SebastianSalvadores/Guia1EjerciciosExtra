/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.

Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        String[][] SopaDeLetras = new String[20][20];
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese palabra entre 3 y 5 caracteres.");
                palabra = leer.next();
                if (palabra.length() < 3 || palabra.length() > 5) {
                    System.out.println("La palabra ingresada no tiene entre 3 y 5 caracteres.");
                }
            } while (palabra.length() < 3 || palabra.length() > 5);
            agregarPalabra(SopaDeLetras, palabra);
        }
        rellenarMatriz(SopaDeLetras);
        imprimirMatriz(SopaDeLetras);
    }

    public static void agregarPalabra(String[][] matriz, String palabra) {
        boolean bandera = false;
        do {

            int numFila = (int) (Math.random() * 20);
            int numColumna = 0;
            int cont = 0;
            int k = 0;

            for (int i = 0; i < 20; i++) {
                if (matriz[numFila][i] == null) {
                    cont++; //Contador para verificar si la fila elegida esta vacia, sino el bucle continua hasta encontrar otra.
                }
                
                if (cont == 20) {
                    bandera = true; //la bandera es para que el Do-While se repita hasta encontrar una fila vacia. Si cuenta 20 posiciones 'null', la fila esta vacia.
                    switch (palabra.length()) { //Para elegir columna hay 3 casos dependiendo de la longitud de la palabra(de 3 a 5 letras), para no salirse de la matriz de 20 columnas.
                        case 3:
                            numColumna = (int) (Math.random() * 17);
                            break;
                        case 4:
                            numColumna = (int) (Math.random() * 16);
                            break;
                        case 5:
                            numColumna = (int) (Math.random() * 15);
                            break;
                    }

                    for (int j = numColumna; j < (numColumna + palabra.length()); j++) {
                        matriz[numFila][j] = palabra.substring(0 + k, 1 + k).toUpperCase();
                        k++; //la k es un contador individual para substring (la SubCadena) de la palabra.
                    }
                    break;
                }
            }
        } while (bandera == false);
    }

    public static void rellenarMatriz(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = String.valueOf((int) (Math.random() * 10)); //.valueOf convierte int a String.
                }
            }
        }
    }

    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("| " + matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
