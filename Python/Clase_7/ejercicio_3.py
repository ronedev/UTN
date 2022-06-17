#Pedir al usuario que ingrese un mes del año, el valor debe ser entre 1 y 12, luego le decimos en que estacion del año se encuentra

estacionActual = 0

while estacionActual > 12 or estacionActual < 1:
    estacionActual = int(input('Ingrese la estación (valor entre 1 y 12, siendo 1 Enero y 12 Diciembre): '))

if(estacionActual >= 1 and estacionActual <=3):
    print('Se encuentra en verano')
elif (estacionActual >= 4 and estacionActual <= 6):
    print('Se encuentra en Otoño')
elif (estacionActual >= 7 and estacionActual <= 9):
    print('Se encuentra en Invierno')
elif (estacionActual >= 10 and estacionActual <= 12):
    print('Se encuentra en Primavera')