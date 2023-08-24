package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // El mayor de dos numeros: 
        //usaremos el operador ternario:
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        System.out.println("COMPARADOR DE NUMERO MAYOR");
        System.out.println("Ingrese el primer valor");
        var num1 = Double.parseDouble(entrada1.nextLine());
        System.out.println("Ingrese el segundo valor");
        var num2 = Double.parseDouble(entrada2.nextLine());
        var resultado = num1 > num2 ? num1: num2; 
        System.out.println("El numero mayor es = " + resultado);
    }
    
}
