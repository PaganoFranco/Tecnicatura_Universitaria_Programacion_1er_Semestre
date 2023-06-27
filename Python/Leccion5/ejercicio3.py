num = 0
while num < 1 or 12 < num:
    num = int(input("Ingrese el numero del mes en el que se encuentra: "))
else:
    if 1 <= num <= 3 :
        print("Estas en la estacion de Verano")
    elif 3 < num <= 6 :
        print("Estas en la estacion de Otoño")
    elif 6 < num <= 9 :
        print("Estas en la estacion de Invierno")
    elif 9 < num <= 12:
        print("Estas en la estacion de Primavera")