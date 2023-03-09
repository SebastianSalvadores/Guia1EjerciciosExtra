/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        boolean primo;
        System.out.println("Ingrese un numero entero: ");
        num = leer.nextInt();
        primo = esPrimo(num);
        if (primo) {
            System.out.println("El numero " + num + " es primo.");
        } else {
            System.out.println("El numero " + num + " no es primo.");
        }
    }

    public static boolean esPrimo(int num) {
        int cont = 0;
        boolean primo;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            primo = true;
        } else {
            primo = false;
        }
        return primo;
    }
}
