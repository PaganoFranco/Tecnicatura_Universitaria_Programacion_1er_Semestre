"""
Calcular la suma de "N" primeros numeros.
"""
num = int(input("Ingrese la cantidad de numeros a sumarse: "))
# inciializamos un contador
contador = 0
# inicializamos la suma
suma = 0
# mientras el contador sea distinto del num debera
while contador != num :
    # se le suma una unidad al contador
    contador += 1
    # sumamos los valores
    suma += contador
else:
    # le visualizamos el resultado al usuario 
    print(f"El resultado de la suma de los N numeros es {suma}")