
package condicional_ejercicio_3;

import java.util.Scanner;

public class Condicional_Ejercicio_3 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Digite un número entre el 0 y el 10: ");
        var calificacion = Integer.parseInt(consola.nextLine());
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        }
        else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("B");

        } else if (calificacion>=7 && calificacion<8) {
            System.out.println("C");

        }else if (calificacion>=6 && calificacion<7){
            System.out.println("D");
        } else if (calificacion>=0&& calificacion<6) {
            System.out.println("F");

        }
        else {
                System.out.println("Fuera de rango");
        }

    }   
}
