"""
Ejercicio 7: Ingresar "N" enteros, visualizar la suma de los numeros
pares de la lista, cuantos numeros pares existen y cual es el promedio
de los numeros impares.
"""
n_elementos = int(input("Digite la cantidad de elementos a ingresar: "))
i = 1
suma_pares = 0
conteo_pares = 0
conteo_impares = 0
suma_pares = 0
suma_impares = 0
while i<= n_elementos:
    num = int(input(f"Digite el {i} numero: "))
    if num % 2 == 0 :
        "Si el numero es par, realizaremos una suma interativa"
        suma_pares = suma_pares + num
        "Conteo de pares"
        conteo_pares = conteo_pares +1
    else:
        "Si el numero es impar, realizaremos una suma interativa"
        suma_impares = suma_impares + num
        "conteo de impares"
        conteo_impares = conteo_impares + 1
    i += 1
else:
    if conteo_pares == 0 :
        print("No se ha digitado numeros pares: ")
    else:
        print(f"La suma de los numeros pares es: {suma_pares}")
        print(f"El conteo de los numeros pares es: {conteo_pares}")

    if conteo_impares == 0:
        print("No se han ingresado numeros impares")
    else:
        promedio_impares = suma_impares/conteo_impares
        print(f"El promedio de impares es: {promedio_impares}")