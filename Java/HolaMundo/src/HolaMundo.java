public class HolaMundo {
    //psvm + Tab (Cada una de las sigas del comando que sigue) 
    public static void main(String[] args) {
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
        
    }
}