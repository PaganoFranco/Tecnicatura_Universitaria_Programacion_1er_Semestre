
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        // Una compañia de venta de carros usados, paga a su personal de ventas
        // un salario de $1000 mensuales mas una comision de $150 por cada carro 
        // vendido, mas 5% de valor de la venta por carro. Cada mes el capturista
        // de la empresa ingresa en la computadora los datos pertinentes.
        // Hacer un programa que calcule e imprima el salario mensual de un 
        // vendedor dato.
        // El salario de 1000 los vamos a manejar como un dato constante, para 
        // asignarlo debemos usarl la palabra reservada final. 
        
        
        Scanner entrada = new Scanner(System.in);
        float comision, precioAutosFinal, porcentajeVenta, salarioMensual; 
        //Definimos la contante
        final int salario = 1000;
        
        System.out.println("CALCULADORA SALARIO MENUSUAL");
        //Le pedimos al usuario que ingrese por teclado la cantidad de autos vendidos
        System.out.println("Ingrse la cantidad de autos vendidos:");
        var autos = Integer.parseInt(entrada.nextLine());
        
        // Le pedimos al usuario que ingrese por teclado el precio de un auto
        System.out.println("Ingrese el precio de un auto");
        var precioAuto = Integer.parseInt(entrada.nextLine());
        
        //comision de $150 por cada carro vendido
        comision = 150 * autos;
        // Total de $ por los autos vendidos
        precioAutosFinal = precioAuto * autos;
        // 5% por el precio de autos vendidos
        porcentajeVenta = precioAutosFinal *0.05F;
        // Salario final: 
        salarioMensual = salario + comision + porcentajeVenta;
        System.out.println("El salario mensual es de  $" + salarioMensual);
        
        
        
    }
    
}
