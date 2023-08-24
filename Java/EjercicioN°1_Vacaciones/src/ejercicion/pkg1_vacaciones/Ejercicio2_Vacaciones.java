
package ejercicion.pkg1_vacaciones;

import java.util.Scanner;

public class Ejercicio2_Vacaciones {
    /*
    Ejercicio 2: En el almacen se hace 20 MOD de descuento a los clientes
    cuya compra supere los $100 ¿Cual sera la cantidad que pagaraa una persona
    por su compra?
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad a pagar: ");
        var compra = Double.parseDouble(entrada.nextLine());
        double descuento = 0;
        if (compra > 100) {
        descuento =(compra*0.2);
        } 
        else {
        descuento = 0;
        }
        var precio_final = compra - descuento; 
        System.out.println("El precio a pagar es: " + precio_final);
    }
}
