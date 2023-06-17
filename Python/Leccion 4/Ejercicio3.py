'''
Ejercicio Nª3
Intercambiar el valor de dos variables
a = 10 → a = 5
b = 5  → b = 10
'''

a = int(input("Ingrese un valor para a: "))
b = int(input("Ingrese un valor para b: "))

aux = a
a = b
b = aux

print(f"El valor de a es: {a}, y el valor de b es: {b}")