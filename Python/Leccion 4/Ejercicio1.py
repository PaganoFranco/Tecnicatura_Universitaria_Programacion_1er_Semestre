'''
Ejercicio Nº1
Debemos plasmar la expresion en una expresion
algebraica, es decir, en formato de codigo
'''

a = float(input("Ingrese el valor de a: "))
b = float(input("Ingrese el valor de b: "))
c = float(input("Ingrese el valor de c: "))

resultado = (a ** 3 * (b ** 2 - (2 * a * c)))/(2 * b)

print(f"El resultado es: {resultado}") 