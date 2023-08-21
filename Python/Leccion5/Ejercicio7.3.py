"""
Leer 10 numeros e imprimir cuantos son primos
cuantos negativos y cuantos neutros
"""
conteo_neutro = 0
conteo_negativo = 0
conteo = 0
conteo_positivo = 0
while conteo != 10:
    num = int(input("Ingrese un numero: "))
    if num == 0:
        conteo_neutro += 1
        conteo +=1
    elif num > 0:
        conteo_positivo += 1
        conteo += 1
    elif num < 0:
        conteo_negativo += 1
        conteo += 1
else:
    print(f"La cantidad de positivos es: {conteo_positivo}")
    print(f"La cantidad de negativos es: {conteo_negativo}")
    print(f"La cantidad de neutro es: {conteo_neutro}")
