/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingrese cantidad de personas: ");
        N = leer.nextInt();
        Mayores(N);

    }

    public static void Mayores(int N) {
        Scanner leer = new Scanner(System.in);
        String nombre, resp;
        int edad;

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese nombre de la persona " + (i + 1) + ":");
            nombre = leer.nextLine();
            System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
            edad = leer.nextInt();

            if (edad > 18) {
                System.out.println("Nombre: " + nombre
                        + "\nEdad: " + edad
                        + "\nEs mayor de edad."
                        + "\n¿Desea continuar (Si/No)?");
                resp = leer.next();
            } else {
                System.out.println("Nombre: " + nombre
                        + "\nEdad: " + edad
                        + "\nEs menor de edad."
                        + "\n¿Desea continuar (Si/No)?");
                resp = leer.next();
            }

            if (resp.equalsIgnoreCase("No")) {
                break;
            }
            leer.nextLine();
        }

    }
}
