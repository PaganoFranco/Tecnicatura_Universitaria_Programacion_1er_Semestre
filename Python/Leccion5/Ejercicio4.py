"""
Ejercicio 4 : Estapas de vida
Haremos un programa que cuando el usuario ingrese su edad
le diga, o imprima la etapa de su vida en una breve oeracion.
"""

edad = int(input("Ingrese su edad: "))
etapa = None
if 0 <= edad <= 10 :
    etapa = "La infancia es increible y bella"
elif 10 < edad <= 19:
    etapa = "Tienes muchos cambios, mucho que estudiar"
elif 19 < edad <= 29:
    etapa = "Amor y comienza el trabajo"
elif 29 < edad <= 39 :
    etapa = "Comienzan las deudas y el dolor de cuerpo"
elif 39 < edad <= 49 :
    etapa = "Pueden aparecer hijos"
else :
    etapa = "Jubiliacion"

print(f"Te encuentas en la etapa {etapa}")

