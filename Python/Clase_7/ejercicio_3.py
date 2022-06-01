#Pedir al usuario que ingrese un mes del año, el valor debe ser entre 1 y 12, luego le decimos en que estacion del año se encuentra

estacion = 0

while estacion > 12 or estacion < 1:
    estacion = int(input('Ingrese la estación (valor entre 1 y 12, siendo 1 Enero y 12 Diciembre): '))

if(estacion >= 1 and estacion <=3):
    print('Se encuentra en verano')
elif (estacion >= 4 and estacion <= 6):
    print('Se encuentra en Otoño')
elif (estacion >= 7 and estacion <= 9):
    print('Se encuentra en Invierno')
elif (estacion >= 10 and estacion <= 12):
    print('Se encuentra en Primavera')