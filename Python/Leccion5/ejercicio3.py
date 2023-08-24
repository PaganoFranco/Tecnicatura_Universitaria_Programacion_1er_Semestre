# Ejercicio 3 - Calculadora estacion del año
mes = int(input("Ingrese el numero del mes en el que se encuentra: "))
estacion = None
if 1 <= mes <= 3:
    estacion = "Verano"
elif 3 < mes <= 6:
    estacion = "Otoño"
elif 6 < mes <= 9:
    estacion = "Invierno"
elif 9 < mes <= 12:
    estacion = "Primavera"
else:
    estacion = "no corresponde a un numero del mes"
print(f"Para el mes Nª {mes}, corresponde a la estacion {estacion}")
""" 
# APLICANDO CICLO WHILE
mes = int(input("Ingrese el numero del mes en el que se encuentra: "))
while mes < 1 or 12 < mes:
    mes = int(input("Ingrese el numero del mes en el que se encuentra: "))
else:
    if 1 <= mes <= 3 :
        print("Estas en la estacion de Verano")
    elif 3 < mes <= 6 :
        print("Estas en la estacion de Otoño")
    elif 6 < mes <= 9 :
        print("Estas en la estacion de Invierno")
    elif 9 < mes <= 12:
        print("Estas en la estacion de Primavera")
"""