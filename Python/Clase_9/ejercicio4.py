#Suponiendo que se tiene un conjunto de calificaciones de un grupo de 10 alumnos. Realizar un algoritmo para calcular la calificacion promedio y la calificacion mas baja de todo el grupo
calificacion_baja = 1000
suma_calificaciones = 0

for i in range(10):
    calificacion = int(input('Digite una calificacion: '))
    suma_calificaciones += calificacion
    if calificacion < calificacion_baja:
        calificacion_baja = calificacion

promedio = suma_calificaciones / 10

print(f'La calificacion mas baja fue: {calificacion_baja}')
print(f'La calificacion promedio de los 10 alumnos fue de: {promedio}')