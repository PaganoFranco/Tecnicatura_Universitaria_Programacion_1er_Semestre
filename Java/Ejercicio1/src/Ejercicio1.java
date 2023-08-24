package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        /*
        Equipo Junior Tech Troopers
        Clase Nº6 - Ejercicio 1
        */
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro");
        String nombreDelLibro = entrada.nextLine();
        System.out.println("Ingrese el id del libro");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el precio del libro");
        double precioDelLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si el encvio es gratuito");
        boolean tipoDeEnvio = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println(nombreDelLibro+" #"+idLibro);
        System.out.println("Precio del libro: $"+ precioDelLibro);
        System.out.println("El envio del libro gratuito es: " + tipoDeEnvio);
        
        
    }    
}