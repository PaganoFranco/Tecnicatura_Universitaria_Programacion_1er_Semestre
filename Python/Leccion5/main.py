"""
# Clase N°6
# CICLO WHITE (Mientras o Durante)

condicion = True
while condicion:
    print("Ejercutando el ciclo while")
else:
    print("Fin ciclo while")

contador = 0
while contador < 78:
    print(f"Ejercutando el ciclo while, {contador}")
    contador += 1
else:
    print("Fin ciclo while")

# Imprimir nuemores del 0 al 5 con el ciclo while
maximo = 5
contador = 0
while contador <= maximo:
    print(contador)
    contador += 1

minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -=1
"""
"""
# CICLO FOR
cadena = "Hello"
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo for")
"""
"""
# Palabra reservada break
for letra in "Alemania":
    if letra == "a":
        print(f"Letra encontrada: {letra}")
        break
else:
    print("Fin del ciclo for")
"""
# Palabra reservada continue
for i in range(6):
    if i % 2 == 0:
        print(f"Valor: {i}")

for i in range(6):
    if i % 2 == 0:
        continue
    print(f"Valor: {i}")