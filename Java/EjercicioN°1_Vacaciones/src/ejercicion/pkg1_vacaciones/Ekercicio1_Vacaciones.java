
package ejercicion.pkg1_vacaciones;

import java.util.Scanner;

public class Ekercicio1_Vacaciones {
    /*
    Ejercicio1: Determinar si un alumno aprueba o reprueba un curso, sabiendo
    que aprobara si su promedop de tres calificaciones es mayor o igual a 70
    repueba en caso contrario. 
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite las 3 Calificaciones: ");
        var nota1 = Integer.parseInt(entrada.nextLine());
        var nota2 = Integer.parseInt(entrada.nextLine());
        var nota3 = Integer.parseInt(entrada.nextLine());
        var promedio = (nota1+nota2+nota3)/3;
        if (promedio >= 70) {
            System.out.println("El alumno esta desaprobado con: "+ promedio);
    } 
        else {
            System.out.println("El alumno esta aprobado con: "+ promedio);
        }
    }
}
