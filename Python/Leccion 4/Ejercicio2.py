'''
Ejercicio N°2
Determine las solucion de la siguiente operacion
((3+5*8)<3 and (-6/3*4)+2<2)) or (a>b)
'''

a = int(input("Ingrese el valor para a: "))
b = int(input("Ingrese el valor para b: "))

resultado = ((3+(5*8)<3 and (-(6/3)*4)+2<2)) or (a>b)

print("El resultado es: Verdadera") if resultado else print("El resultado es: Falso")