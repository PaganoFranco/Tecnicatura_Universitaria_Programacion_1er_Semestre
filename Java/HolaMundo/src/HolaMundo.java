
import java.util.Scanner;

public class HolaMundo {
    //psvm + Tab (Cada una de las sigas del comando que sigue) 
    public static void main(String[] args) {
        /*
        //Clase Nº1 - Fundamentos Java
        //sout + Tab
        System.out.println("Hola Mundo desde Java");     
        
        //Clase Nº2 - Variables en Java Parte 1
        //int variable primitiva de tipo entera
        int miVariable = 10;
        //Un atajo rapido para usar la variables es "mi" + control + espoacio
        System.out.println(miVariable);
        //Reutilizar la variable y cambiar el valor
        miVariable = 5;
        //Recordatorio, no volver a definir la variable 
        System.out.println(miVariable);
        //Tipo String (Tipo Objetos) 
        String miVariableCadena = "Bienvenido";      
        System.out.println(miVariableCadena);
        //Reutilizamos la variable cadena 
        miVariableCadena = "Sigamos Creciendo en programación";
        System.out.println(miVariableCadena);    
        
                //INFERENCIAS DE TIPO 
        //Var ← Inferencia de tipos en java
        var miVariableEntera2 = 10; 
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = "+ miVariableEntera2);
        System.out.println("miVariableCadena2 = "+ miVariableCadena2);
        //sout + tab
        //Para ejecurtar shift + F6 
        */
        
        //Clase Nº3 - Variables en Java Parte 2 
        //Reglas para definir una varaible 
        var miVariableEjemplo = 45; 
        //Los unicos caracteres que se pueden usar al principio son "$" o "_"
        //No se pueden colocar acentos en las variables
        
        var usuario = "Franco";
        var titular = "Profesor";
        var union = titular + " " + usuario; 
        //Se le agrega " ", para generar espacio entre las variables
        System.out.println("union = " + union);
        //Ordenar programacion = click derecho + Format 
        
        var a = 8;
        var b = 4;
        System.out.println(a + b);
        //Como las dos variables numerica el resultado es la suma 
        System.out.println("a+b = " + a + b);
        //Al combinar variables del tipo cadena con numeros el resultado es
        // una variablo del tipo cadena por contexto (concatenar).
        System.out.println(usuario + " " + (a+b));
        //Al colocar entre parentesis la variable numerica se resuelve la suma
        // y no las variables como cadena
        
        //Caracteres especiales en JAVA
        var nombre = "Julieta";
        System.out.println("Nueva linea: \n" + nombre);
        //al usar dentro de un print \n realiza un salto de pagina
        System.out.println("Tabulador: \t" + nombre);
        //al usar dentro del print \t deja un espacio entre ambos
        System.out.println("\t _MENU_");
        //al usarlo al principio \t centra la variable o lo corre al centro de la consola
        System.out.println("Retroseso: \b" + nombre);
        //al usar \b borra un lugar hacia atras, en este caso, el espacio
        System.out.println("comillas simples: \'" + nombre+ "\'");
        //Al usar \' coloca entre '' la cadena que sigue
        System.out.println("comillas Dibles: \"" + nombre + "\"");
        //Al usar \" coloca entre "" la cadena que sigue
          
      
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        //entrada es solamente un nombre (puede ser cualquiera)
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        //El termino nextLine delimita la variable como string
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("\"Resultado: \" + titulo2 + \" \" + usuario2");
    }
}