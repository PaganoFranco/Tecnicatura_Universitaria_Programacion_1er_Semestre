"""
Ejercicio 8: Dadas las horas trabajadas de 5 personas y la
tarifa de pago, calcular el salario y la sumatoria
de todos los salarios
"""
i = 1
suma = 0
while i<=5:
    print(f"Salario del {i} empleado")
    horas = int(input(f"Digite las horas trabajadas: "))
    tarifa = int(input("Digite la tarifa por hora: "))
    salario = horas * tarifa
    print(f"El salario es ${salario}")
    suma = suma+salario
    i = i + 1
else:
    print(f"La suma de todos los salarios es: {suma}")