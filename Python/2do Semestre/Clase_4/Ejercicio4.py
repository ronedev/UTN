#Sacar la raiz cuadrada de un numero positivo

import math

num = int(input('Ingrese un numero a calcular la raiz: '))

while num < 0:
    num = int(input('Ingrese un numero valido para la operacion: '))

print(int(math.sqrt(num)))