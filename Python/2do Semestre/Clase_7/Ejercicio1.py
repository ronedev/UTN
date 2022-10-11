#Crear una funcion para multiplicar los valores recibidos de tipo numerico, utilizando argumentos variables *args como parametro de la funcion y regresar como resultado la multiplicacion de todos los valores pasados como argumento

def multiplicarLista (*lista):
    resultado = 1
    for num in lista:
        resultado = resultado * num
    return resultado

print(multiplicarLista(1,2,3,4,5))