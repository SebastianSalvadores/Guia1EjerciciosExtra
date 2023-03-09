/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package guia1extra;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[][] matrizAlumnos = new double[10][5];
        int cantAprobados;
        cargarNotas(matrizAlumnos);
        calcularPromedios(matrizAlumnos);
        cantAprobados = totalAprobados(matrizAlumnos);
        System.out.println("La cantidad de alumnos aprobados fue " + cantAprobados + " y la de desaprobados " + (10 - cantAprobados) + ".");
    }

    public static void cargarNotas(double[][] matriz) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese nota del ");
                switch (j) {
                    case 0:
                        System.out.print("Primer trabajo práctico evaluativo ");
                        break;
                    case 1:
                        System.out.print("Segundo trabajo práctico evaluativo ");
                        break;
                    case 2:
                        System.out.print("Primer Integrador ");
                        break;
                    case 3:
                        System.out.print("Segundo Integrador ");
                        break;
                }
                System.out.println("del alumno " + (i + 1) + ":");
                //matriz[i][j] = (int)(Math.random() * 10) + 1;
                matriz[i][j] = leer.nextDouble();
            }
        }
    }

    public static void calcularPromedios(double[][] matriz) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        matriz[i][4] += matriz[i][j] * 0.1;
                        break;
                    case 1:
                        matriz[i][4] += matriz[i][j] * 0.15;
                        break;
                    case 2:
                        matriz[i][4] += matriz[i][j] * 0.25;
                        break;
                    case 3:
                        matriz[i][4] += matriz[i][j] * 0.5;
                }
            }
        }
    }

    public static int totalAprobados(double[][] matriz) {
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            if (matriz[i][4] >= 7) {
                cont++;
            }
        }
        return cont;
    }
}
