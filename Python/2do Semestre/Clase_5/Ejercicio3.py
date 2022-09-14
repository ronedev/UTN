#Hacer un programa que pida un numero por tecaldo y guarde en una lista su talba de multiplicar 

def tablaMultiplicar(num):
    tabla = []
    for i in range(1, 11):
        valor = num * i
        tabla.append(valor)
    return tabla

num = int(input('Digite que tabla desea calcular: '))
print(tablaMultiplicar(num))