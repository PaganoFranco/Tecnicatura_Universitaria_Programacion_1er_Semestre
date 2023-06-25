
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Hacer un programa que calcule e imprima la suma de tres calificaciones.
        // Perdi las calificaciones al usuario, crear un proyecto llamado
        // Ejercicio5
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("SUMADORA");
        //Le pedimos al ususario que ingrese la primeras 3 notas: 
        System.out.println("Ingrese la primera nota: ");
        var nota1 = Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese la segunda nota: ");
        var nota2 = Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese la tercer nota: ");
        var nota3 = Double.parseDouble(entrada.nextLine());
        
        //Realizamos la suma y la visaulizamos: 
        var suma = nota1 + nota2 + nota3; 
        System.out.println("La suma de las 3 notas es = " + suma);
        
    }
    
}
