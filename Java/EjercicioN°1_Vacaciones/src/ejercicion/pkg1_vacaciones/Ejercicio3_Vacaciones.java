
package ejercicion.pkg1_vacaciones;

import java.util.Scanner;

public class Ejercicio3_Vacaciones {
    /*
    Ejercicio 4: Leer 2 numeros; si son iguales que los multiples, si el
    primero es mayor que el segundo que los reste y si no que los sume
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dos numeros: ");
        var num1 = Double.parseDouble(entrada.nextLine());
        var num2 = Double.parseDouble(entrada.nextLine());
        double resultado = 0;
        if (num1 == num2) {
        /*Si son iguales se multiplican*/
        resultado = num1*num2;
        } 
        else if (num1>num2) {
        resultado = num1+num2;
        }
        else {
        resultado = num1-num2;
        }
        System.out.println("El resultado es: "+ resultado);
    }
}
