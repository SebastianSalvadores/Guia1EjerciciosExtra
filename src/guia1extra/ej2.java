/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia1extra;

/**
 *
 * @author Sebastian
 */
public class ej2 {

    public static void main(String[] args) {
        int A = 5, B = 19, C = 14, D = 9, aux;
        System.out.println("Valores iniciales: A=" + A + ", B=" + B + ", C=" + C + " y D=" + D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("");
        System.out.println("Valoses finales: A=" + A + ", B=" + B + ", C=" + C + " y D=" + D);
    }
}
