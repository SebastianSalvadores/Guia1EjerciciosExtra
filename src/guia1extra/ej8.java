/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0, cont = 0, pares = 0, impares = 0;
        do {
            System.out.println("Ingrese numero entero mayor a 0:");
            num = leer.nextInt();
            if (num > 0) {
                if (num % 5 == 0) {
                    break;
                }
                cont++;
                if (num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        } while (num < 1 || num % 5 != 0);

        System.out.println("La cantidad de numeros leidos fueron " + cont + ", la cantidad de pares fueron " + pares + " y los impares " + impares);
    }
}
