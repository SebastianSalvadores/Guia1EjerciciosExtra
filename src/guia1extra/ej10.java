/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resp = 0;
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int mult = num1 * num2;
        System.out.println("Adivine el resultado:");
        do {
            resp = leer.nextInt();
            if (resp != mult) {
                System.out.println("Respuesta incorrecta. Ingrese nuevamente:");
            }
        } while (resp != mult);
        System.out.println("Felicitaciones! Adivinaste el resultado.");
    }
}
