"""
Ejercicio 5 : Sistema de Calificaciones
El objeto del programa sera crear un sistema de calificacion
de la siguiente manera:
Le pediremos al ususario que ingrese un valor del 0 al 10

Si se ingresa un 9 o 10 imprimimos A
entre 8 y menor a 9 imprimimos B
entre 7 y menor a 8 imprimimos C
entre 6 y menor a 7 imprimimos D
entre 0 y menor a 6 imprimimos F
De lo contrario el valor ingresado sera incorrecto.
"""

nota = int(input("Ingrese una nota: "))
calificacion = None
if 9 <= nota <= 10 :
    calificacion = "A"
elif 8 <= nota < 9 :
    calificacion = "B"
elif 7 <= nota < 8 :
    calificacion = "C"
elif 6 <= nota < 7 :
    calificacion = "D"
elif 0 <= nota < 6 :
    calificacion = "F"
else :
    calificacion = "Error"
print(f"con una nota de {nota} equivale a una calificacion {calificacion}")