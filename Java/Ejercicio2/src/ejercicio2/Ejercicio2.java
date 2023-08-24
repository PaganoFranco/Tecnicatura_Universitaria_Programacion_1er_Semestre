
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    
    public static void main(String[] args) {
      
// Hacer un programa que calcule e imprima el salario de un empleado, 
// a partir de sus horas semanales trabajadas y de su salario por hora
        System.out.println("CALCULADORA DE SALARIO");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajas: ");
        var horas = Double.parseDouble(entrada.nextLine());
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingrese el salario por hora: ");
        var salario = Double.parseDouble(entrada2.nextLine());
        var cobroFinal = salario * horas; 
        System.out.println("Usted cobrara un total de $ = " + cobroFinal);

    }
    
}
