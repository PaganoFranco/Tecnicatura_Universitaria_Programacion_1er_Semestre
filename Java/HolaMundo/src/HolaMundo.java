
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
        
        
        //Clase Nº4 - Tipos Primitivo en Java Parte 1
        //byte numEnteroByte = 10;
        byte numEnteroByte = (byte)127;
        //Si le asignamos un valor mayor o menor nos saldra un error a menos que
        //hagamos una convercion de tipo pero solo sabe contar desde -127 a 128.
        //Este error se conoce como perdida de presicionm ejemplo:
        //byte numEnteroByte = (byte)127;
        System.out.println("numEnteroByte: " + numEnteroByte);
        System.out.println("Valoe minimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valoe maximo del Byte: " + Byte.MAX_VALUE);
        
        short numEnteroShort = 10;
        System.out.println("numEnteroByte: " + numEnteroShort);
        System.out.println("Valoe minimo del Short: " + Short.MIN_VALUE);
        System.out.println("Valoe maximo del Short: " + Short.MAX_VALUE);
        
        int numEnteroInt = 10;
        System.out.println("numEnteroInt: " + numEnteroInt);
        System.out.println("Valoe minimo del Int: " + Integer.MIN_VALUE);
        System.out.println("Valoe maximo del Int: " + Integer.MAX_VALUE);
        
        //long numEnteroLong = 10;
        long numEnteroLong = 9223372036854775807L;
        //Para que tome un valor largo, al final debemos agregar la "L" de Long, sino
        //siempre lo toma como un int por defecto. 
        System.out.println("numEnteroLong: " + numEnteroLong);
        System.out.println("Valoe minimo del Long: " + Long.MIN_VALUE);
        System.out.println("Valoe maximo del Long: " + Long.MAX_VALUE);
        
        
        float numFloat = 5.3F;
        //Para designar a un numero flotante se puede usar: 10.0F de float o 
        //sino (float)10.0, sino al usar un punto decimal nos tomar de otro tipo y no float.
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de Float: "+ Float.MIN_VALUE);
        System.out.println("El valor maximo de Float: "+ Float.MAX_VALUE);
        //Los numeros se expresar con exponentes por su longitud al escribirlo. 
        
        double numDouble = 5.3;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de Double: "+ Double.MIN_VALUE);
        System.out.println("El valor maximo de Double: "+ Double.MAX_VALUE);
        
        
        //Clase 5
        //Clase 6 
        //EN NOTION
        
        //Clase 7
        int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion multriplicacion = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion division = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la division = " + solucion2);
        
        solucion = num1 % num2; //Guarda el residuo entero de la division.
        System.out.println("solucion = " + solucion); // 5/4 
        
        if (num1 % 2 == 0)
        System.out.println("Es un numero par");
        else
        System.out.println("Es un numero impar");
        
        
        //OPERADOR DE ASIGNACION
        int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2; //Una operacion
        System.out.println("varNum3 = " + varNum3);
        
        // += -= *= /= %=
        varNum1 += 1; //
        System.out.println("varNum1 = " + varNum1);
         varNum2 -= 2; //
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5; //
        System.out.println("varNum1 = " + varNum1);
         varNum3 /= 4; //
        System.out.println("varNum3 = " + varNum3);
         varNum1 %= 6; //
        System.out.println("varNum1 = " + varNum1);
        
        
        //Clase8
        //OPERADORES UNARIOS:
        //Cambio de signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        
        //Operador de negacion 
        var varC = true; //Esta literal por defaut en Java es de tipo boolean.
        var varD = !varC; //
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //OPERADOR UNITARIO DE INCREMENTO: 
        //Preincremento: 
        var varE = 9; //Se va a modificar su valor
        var varF = ++varE; //Simbolo antes de la variable
        //Primero se incrementa la vairable y despues se usar su valor
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF);
        //Postincremento
        var varG = 3;
        var varH = varG++; //Primero el valor de la vairable, luego el incremento.
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        //Operadores Unitarios de decremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);
        //Postdecremento
        var varK = 8;
        var varL = varK--;
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);
        
        //OPERADORES DE IGUALDAD Y RELACIONALES 
        var aNum = 5;
        var bNum =4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA ="Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("cVar = " + cVar);
        
        var gVar = aNum >= bNum;
        System.out.println("gVar = " + gVar);
        gVar = aNum <= bNum;
        System.out.println("gVar = " + gVar);
        gVar = aNum == bNum;
        System.out.println("gVar = " + gVar);
        
        if (aNum % 2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");   
        }
        
        var edad = 30;
        var adulto = 18; 
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
        //OPERADOR RELACIONAL
        var valorA = 7;
        var valorMinimo = 0;
        var ValorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        System.out.println("respuesta = " + respuesta);
        
        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("No esta dentro del rango establecido");
        }
        
        var vacaciones = false;
        var diaLibre = true; 
        if (vacaciones || diaLibre) {
            System.out.println("Papa puede asistir al juego de su hijo"); 
        } else {
            System.out.println("Papa no puede asistir al juego de su hijo"); 
        }
        */
        //OPERADOR TERNEARIO
//        var resultadoT = (5 > 4) ? "Verdadero": "Falso";
//        System.out.println("resultadoT = " + resultadoT);
//        
//        var numeroT = 7;
//        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        
//          var x = 5;
//          var y = 10;
//          var z = ++x + y--;
//          System.out.println("x = " + x);
//          System.out.println("y = " + y);
//          System.out.println("z = " + z);
//        
//          var solucionAritmetica = 4+5*6/3; // 4+((5*6)/3) = 4+(30/3) = 4+10 = 14
//          System.out.println("solucionAritmetica = " + solucionAritmetica);
//          
//          solucionAritmetica = (4+5)*6/3;
//          System.out.println("solucionAritmetica = " + solucionAritmetica);

           
            
          
    }
} 