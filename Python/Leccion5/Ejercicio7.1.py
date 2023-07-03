"""
Diseñar un programa que ingresado un año, nos devuelva
por consola si es un año bisiesto O no, repetir la acción
hasta que el usuario lo desida.
"""
print("ANALIZADOR DE AÑO BISIESTO")
# Inicializamos la variable para ingresar al ciclo WHILE
opcion = 0
# Colocamos la condicion para que cuando sea falsa salga del mismo.
while opcion != 1:
    # Le pedimos al usuario que ingrese un valor por teclado
    num = int(input("Ingrese un año: "))
    # Realizamos el analisis del año
    if ((num % 4 == 0) and (num % 100 != 0) or num % 400 == 0):
             print(f"El año {num} es bisiesto")
    else:
            print(f"El año {num} no es bisiesto")
    #Luego del analisis le pedimos que ingrese por teclado el valor de opcion
    opcion = int(input("Para seguir adelante presione la opcion 1: "))