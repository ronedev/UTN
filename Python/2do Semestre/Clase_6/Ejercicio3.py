#Crear una funcion para sumar los valores recibidos de tipo numéricos, utilizando argunmentos variables *args como parametro de la funcion y agregar como resultado la suma de todos los calores pasasados como argumentos

def suma(*numeros):
    suma = 0
    for num in numeros:
        suma += num
    print(suma)

suma(6,10,4,5,5)