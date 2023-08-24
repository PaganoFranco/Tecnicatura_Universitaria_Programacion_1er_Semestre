package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Se solicita calcular el área y el perímetro de un rectángulo, para 
        //esto deberemos crear las variables:
        //Alto (int)
        //Ancho(int)
        //El usuario debe proporcionar los valores de alto, ancho y después se 
        //debe imprimir el resultado en el siguiente formato: (recuerden no 
        //usar acentos, respetar los espacios, mayúsculas, minúsculas y saltos de líneas.

        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        
        System.out.println("CALCULADORA ARA Y PERIMETRO RECTANGULO");
        System.out.println("Ingrese el valor del Alto del rectangulo");
        var alto = Double.parseDouble(entrada1.nextLine());
        System.out.println("Ingrese el valor del Ancho del rectangulo");
        var ancho = Double.parseDouble(entrada2.nextLine());
        var area = alto*ancho;
        System.out.println("area = " + area);
        var perimetro = (alto+ancho)*2;
        System.out.println("perimetro = " + perimetro);
        
    }
    
}
