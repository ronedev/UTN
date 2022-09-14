#Sumar numero pares dentro de un rango por ejemplo suma de numeros pares del 2 al 30 suma = 240

def sumaNumerosPares(inicio, final):
    suma = 0
    for i in range(inicio - 1, final + 1):
        if(i % 2 == 0):
            suma = suma + i

    print(suma)

sumaNumerosPares(2, 30)