/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char tipoSocio;
        double valor;
        double total = 0;
        boolean validar;
        System.out.println("Ingrese clase de socio (A, B o C):");
        tipoSocio = leer.next().charAt(0);
        System.out.println("Ingrese costo del tratamiento: ");
        valor = leer.nextDouble();
        switch (tipoSocio) {
            case 'A':
            case 'a':
                total = valor - (valor * 0.5);
                validar = true;
                break;
            case 'B':
            case 'b':
                total = valor - (valor * 0.35);
                validar = true;
                break;
            case 'C':
            case 'c':
                total = valor;
                validar = true;
                break;
            default:
                validar = false;
        }
        if (validar) {
            System.out.println("El valor del tratamiento será de: $" + total);
        } else {
            System.out.println("Clase de socio incorrecta.");
        }
    }

}
