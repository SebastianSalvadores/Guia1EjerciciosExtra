/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package guia1extra;

import static java.lang.Math.floor;
import static java.lang.Math.round;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ej1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tiempo en minutos: ");
        int mins = leer.nextInt();
        Conversor(mins);
    }
    public static void Conversor(int m){
        double dia = 0, hora = 0, h = 0;
        if (m >= 60){
            h = ((double)m / 60);
            hora = floor(h);
            h = round((h - (int)hora) * 60);
            if (hora >= 24){
                double d = hora / 24;
                dia = floor(d);
                hora = round((d - dia) * 24);
            }
        }else h = m;
        
        System.out.println(m+" minutos equivalen a "+ dia +" dias, "+hora+" horas y "+h+" minutos.");
    }
}
