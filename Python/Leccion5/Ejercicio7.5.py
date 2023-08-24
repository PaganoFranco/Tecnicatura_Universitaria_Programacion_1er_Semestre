"""
Ejercicio 5: Calcular el factorial de un numero mayor o igual a 0.
"""
num = int(input("Ingrese un numero: "))
while num < 0:
    num = int(input("Ingrese un numero: "))
else:
    i=1
    factorial=1
    while i<=num:
        factorial = factorial * i
        i += 1
    else:
        print(f"El factorial es: {factorial}")