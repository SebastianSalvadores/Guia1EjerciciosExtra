/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,cont;
        System.out.println("Ingrese altura de la escalera:");
        num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            cont = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(cont);
                cont++;
            }
            System.out.println("");
        }
    }
}
