
package ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        // Guillermo tiene N dolares. Luis tiene la mitad de lo que posee 
        // Guillermo. Juan tiene la mitad de lo que posee Luis y 
        // Guillermo juntos. Hacer un programa que calcule e imprima la
        // cantidad de dinero que tienen entre los tres.
        // Crear un proyecto llamado Ejercicio6.
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los dolares que posee Guillermo");
        //Ingresamos por teclado los dolares de Guillermo
        var guillermo = Double.parseDouble(entrada.nextLine());
        //Calculamos los dolares que posee Luis
        var luis = guillermo/2;
        System.out.println("Luis tiene una cantidad de US$" + luis);
        //Calculamos los dolares que posee Juan
        var juan = (guillermo + luis)/2;
        System.out.println("Juan tiene una cantidad de US$" + juan);
        //Calculamos el total de dolares que poseen entre los 3
        var suma = guillermo + luis + juan; 
        System.out.println("En los tres en total poseen US$" + suma);
        
    }
    
}
