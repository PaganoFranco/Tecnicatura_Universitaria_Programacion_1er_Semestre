# Clase N° 2 - Variables
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

# Clase N°3 - Tipos de datos Int, Float, String, Bool
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