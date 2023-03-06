/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej3 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        do {            
            System.out.println("Ingrese una letra:");
            letra = leer.next();
        } while (letra.length() != 1);
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
            System.out.println("La letra "+letra+" es una vocal.");
        }else{
            System.out.println("La letra "+letra+" no es una vocal.");
        }
    }
}
