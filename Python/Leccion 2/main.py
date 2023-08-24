'''
# CLASE N° 2 - Variables
miVariable = 3
print(miVariable)
miVariable = "Hola a todos los estudiantes de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
# Las literales se escibren x528, la variable y = x272, la variable z = 592
print(id(y))
print(id(z))

# CLASE N°3 - Tipos de datos Int, Float, String, Bool
# tipo Int
a = 10
print(a)
print(type(a))
# tipo String
a = "Hola estudiantes"
print(a)
print(type(a))
# el comando type me escribe el tipo de dato que tiene la variable
a: str = "Hola estudiantes"
print(a)
print(type(a))
# En este caso se le agrega ": str" para referirse al tipo de dato, no lo condiciona
# tipo flotante:
a = 10.70
print(a)
print(type(a))
# Tipo Booleano
a = True
print(a)
print(type(a))
a = False
print(a)
print(type(a))
# Se escribren siempre con la primera en mayuscula

# Manejo de cadenas (String)
miGrupoFavorito = "Guns and Roses"
print("Mi grupo favorito es: " + miGrupoFavorito)

# Manejo de cadenas (String)
miGrupoFavorito = "Guns and Roses"
caracteristicas = "The best rock band"
# Una forma de concatenar es con el "+"
print("Mi grupo favorito es: " + miGrupoFavorito + " " + caracteristicas)
# Otra forma de concatenar es usando ","
print("Mi grupo favorito es:" , miGrupoFavorito , caracteristicas)
# la direfencia es que al usar el signo "+", debemos agregar los espacios.
# por otro lado, al usar la "," se asginan de forma automatica los espacios.

numero1 = "7"
numero2 = "8"
print(numero1 + numero2)
# De este modo, solo concatena las variables definidas como string
print(int(numero1 + numero2))
# al usar Int, convertimos de tipo string a tipo entero, siempre y cuando
# el string sea un numero

# Tipo Booleanos (Bool)
miBooleano = 1 > 2
print(miBooleano)
# condicional
if miBooleano:
    print("El resultado es Verdadero")
else:
    print("El resultado es Falso")


# Procesar la entrada del usuario
resultado = input("Ingrese un numero: ") # Regresa un dato del tipo string
print(resultado)

# Conversion de la entrada de datos
numero1 = int(input("Escribir el primer numer: "))
numero2 = int(input("Escribir el segundo numero: "))
resultado = numero1 + numero2
print("la resultado de la suma es:", resultado)

# CLASE N°4 - Operadores en Python Parte 1
operadorA = 8
operadorB = 5
#Adiccion
suma = operadorA + operadorA
#print("El resultado de la suma es", suma)
print(f'El resultado de la suma es {suma}')
#Sustraccion
resta = operadorA - operadorB
print(f'El resultado de la resta es {resta}')
#Multiplicacion
multiplicacion = operadorA * operadorB
print(f'El resultado de la multiplicacion es {multiplicacion}')
#Division
division = operadorA/operadorB
print(f'El resultado de la division es {division}')
#Division Entera
divisionE = operadorA//operadorB
print(f'El resultado de la division es {divisionE}')
#Exponente
exponente = operadorA ** operadorB
print(f'El resultado de la exponente es {exponente}')
#Modulo/Residuo
modulo = operadorA % operadorB
print(f'El resultado de la division o resultado (modulo) es {modulo}')

# Ejercicio clase Nº4 - Rectacgulo:
alto = int(input("Ingrese la medida del alto del rectangulo: "))
ancho = int(input("Ingrese la medida del ancho del rectangulo: "))
area = alto * ancho
perimetro = 2*(alto + ancho)
print(f"El area del rectangulo es: {area}")
print(f"El perimetro del rectangulo es: {perimetro}")

# Operador de incremento con reasignacion:
miVariable3 = 10
print(miVariable3)
# operador de reasignacion:
# Forma basica:
miVariable3 = miVariable3 + 1
print(miVariable3)
# Forma redusida (sintaxis)
miVariable3 += 1
print(miVariable3)
#miVariable3 = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)
#miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)
#miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)

# Operadores de compracion
d = 4
b = 2
# Igualdad
resultado = d == b
print(resultado)
# Desigualdad
resultado = d != b
print(resultado)
# Mayor
resultado = d > b
print(resultado)
# Menor
resultado = d < b
print(resultado)
# Mayor o igual
resultado = d >= b
print(resultado)
# Menor o igual
resultado = d <= b
print(resultado)

# Ejericio Numero Par o Impar
num = int(input("Ingrese un numero: "))
print(f"El residuo de la division es: {num % 2}")
if num % 2 == 0:
    print(f"El numero {num} es par")
else:
 print(f"El numero {num} es impar")

# Ejercicio Determinar si es mayor de edad
edadPersona = int(input("Ingrese su edad: "))
edadAdulto = 18
if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona}, eres mayor de edad")
else:
    print(f"Su edad es: {edadPersona}, eres menor de edad")

# CLASE Nº5 - Operadores en Python parte 2
# Operadores logicos
a = True
b = False
# AND
resultado = a and b
print(resultado)
# OR
resultado = a or b
print(resultado)
# NOT
resultado = not a
print(resultado)
resultado = not b
print(resultado)

# Ejercicio: valor dentro de un rango
num = int(input("Ingrese un numero: "))
valorMinimo = 0
ValorMaximo = 5
dentroRango = (num >= valorMinimo and num<= ValorMaximo)
if dentroRango:
    print(f"El numero {num}, se encuentra en el rango")
else:
    print(f"El numero {num}, no se encuentra en el rango")

# Ejercicio: Operador or
vacaciones = False
diaLibre = True
if not (vacaciones or diaLibre):
    print("Puede asistir al juego")
else:
    print("No puede asistir al juego")

# Ejercicio: Rango entre las edades 20 y 30 años
edad = int(input("Ingrese sue edad: "))
#veinte = edad >= 20 and edad < 30
#print(veinte)
#treinta = edad >= 30 and edad < 40
#print(treinta)

#Sintaxis simplificada del operador and

#if veinte or treinta:
if (20 <= edad < 30) or (30 <= edad < 40) :
    print("Esta dentro del rango de los (20\'0) a (30\'0) años ")
    #if veinte:
    #    print("Esta dentro del rango de los (20\'0) años ")
    #elif treinta:
    #    print("Esta dentro del rango de los (30\'0) años ")
    #else:
    #    print("No esta dentro del rango")
else:
    print("No esta dentro del rango de los (20\'0) a (30\'0) años ")

# Ejercicio: El mayor de dos numeros:
numero1 = int(input("Ingrese el valor para el numero1: "))
numero2 = int(input("Ingrese el valor para el numero2: "))

if numero1 > numero2:
    print("El numero 1 es mayor")
else:
    print("El numero 2 es mayor")
'''

# Ejercicio: tienda de liros
print("Digite los siguientes datos del lirbo")
nombre = input("Ingrese el nombre del libro: ")
id = int(input("Ingrese el ID libro: "))
precio = float(input("Ingrese el precio del libro: "))
envioGratis = input("Indicar si el libro es gratuito (True/False): ")

if envioGratis == "True":
    envioGratis = True
elif envioGratis == "False":
    envioGratis = False
else:
    envioGratis = "El valor es incorrecto, debe escrribir True/False"
print(f'''
            Nombre: {nombre}
            ID: {id}
            precio: {precio}
            Envio Gratis: {envioGratis}
''')