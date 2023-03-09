/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opc, suma, resta, mult;
        double div;
        System.out.println("Ingrese el primer numero:");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = leer.nextInt();
        do {
            System.out.println("Ingrese operacion a realizar: "
                    + "\n1. Sumar"
                    + "\n2. Restar"
                    + "\n3. Multiplicar"
                    + "\n4. Dividir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    suma = Sumar(num1, num2);
                    System.out.println("La suma de los numeros es: " + suma);
                    break;
                case 2:
                    resta = Restar(num1, num2);
                    System.out.println("La resta de los numeros es: " + resta);
                    break;
                case 3:
                    mult = Multiplicar(num1, num2);
                    System.out.println("La multiplicación de los numeros es: " + mult);
                    break;
                case 4:
                    div = Dividir(num1, num2);
                    System.out.println("La división de los numeros es: " + div);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                    System.out.println("");
            }
        } while (opc < 1 || opc > 4);
    }

    public static int Sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    public static int Restar(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }

    public static int Multiplicar(int num1, int num2) {
        int mult;
        mult = num1 * num2;
        return mult;
    }

    public static double Dividir(int num1, int num2) {
        double div;
        div = (double) num1 / num2;
        return div;
    }
}
