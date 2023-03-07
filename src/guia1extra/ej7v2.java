/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej7v2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 0, num, max = 0, min = 0,cont;
        double prom = 0;
        do{
            System.out.println("Ingrese valor de n numeros (n>0):");
            n = leer.nextInt();
        }while(n < 1);
        cont = n;
        do{
            System.out.println("Ingrese un valor: ");
            num = leer.nextInt();
            
            if (cont == n){
                min = num;
            }
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
            
            prom += num;
            cont--;
        }while(cont > 0);
        prom = prom / n;
        System.out.println("El valor maximo fue "+max+", el valor minimo "+min+" y el promedio fue de "+prom);
    }
}
