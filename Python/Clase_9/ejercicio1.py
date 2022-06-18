#Diseñar programa que ingresando un año nos devuelva si es bisiesto o no, repetir la accion hasta que el usuario lo desida
opcion = 1
while opcion == 1:
    anio = int(input('Ingrese el año: '))
    if((anio % 4 == 0)and(anio % 100 != 0) or anio % 400 == 0):
        print(f'El año {anio} es bisiesto')
    else:
        print(f'El año {anio} NO es bisiesto')
    opcion = int(input('Si desea continuar presione 1, sino ingrese cualquier numero: '))
