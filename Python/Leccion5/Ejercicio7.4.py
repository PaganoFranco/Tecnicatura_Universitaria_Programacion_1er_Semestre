"""
Ejercicio4: Supongamos que se tiene un conjunto de calificaciones
de un grupo de 10 alumnos. Realizar un algoritmo para calcular la
calificacion promedio y la calificacion mas baja de todo el grupo
"""
suma = 0
calificacion_baja = 9999
conteo = 0
while conteo != 10:
    calificacion = int(input("Digite una calificacion: "))
    suma += calificacion
    if calificacion < calificacion_baja:
        calificacion_baja = calificacion
    calificacion_promedio = suma/10
    conteo += 1
else:
    print(f"La calificacion promedio es: {calificacion_promedio}")
    print(f"La caligicacion mas baja es: {calificacion_baja}")