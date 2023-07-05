
package condicional_ejercicio_1;

import java.util.Scanner;

public class Condicional_Ejercicio_1 {
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estacion desconocida";
        if(mes == 1 || mes == 2 || mes == 3){
            estacion = "Verano";
        }
        else {
            System.out.println("estacion = " + estacion);
        }
    }
}
        