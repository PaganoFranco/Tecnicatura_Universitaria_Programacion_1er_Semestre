"""
Ejercicio 4: Area y Longitud de un circulo
Hacer un programa para ingresar el radio de un circulo
y se reporte su area y longitud de la circunferencia.
"""
from math import pi

radio = float(input("Ingrese el valor del radio del circulo: "))
area = pi* radio**2
circunferencia = 2 * pi * radio
print(f"El area del circulo es: {area}")
print(f"La circunferencia del circulo es: {circunferencia}")