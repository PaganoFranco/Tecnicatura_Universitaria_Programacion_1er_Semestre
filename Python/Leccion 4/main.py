# CLASE 6 - Sentencias de Control
'''
# Sentencia if/else
condicion = True
if condicion == True:
    print("Condicion Verdader")
elif condicion == False:
    print("Condicion Falsa")
else:
    print("Condicion sin espesificar")

# Ejercicio: Conversion de texto a numero
num = int(input("Ingrese un numero en el rango (1 a 3): "))
numTexto = ""
if num == 1:
    numTexto = "Numero uno"
elif num == 2:
    numTexto = "Numero dos"
elif num == 3:
    numTexto = "Numero tres"
else:
    numTexto = "Has ingresado un numero fuera del rango"
print(f"El numero ingresado es: {num} - {numTexto}")
'''

condicion = True
# if condicion:
#     print("Condicion Verdadera")
# else:
#     print("Condicion Falsa")

print("Condicion Verdadera") if condicion else print("Condicion falsa")