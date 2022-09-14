#Realizar un juego para adivinar un numero. Para ello se debe generar un numero aleatorio entre 1 y 100, y luego ir pidiendo numeros indicando si es mayor o menor. Al usuario acertar mostrar numero de intentos

from random import randint

numAleatorio = randint(1, 100)

print('¡Que comience el juego!')
intentos = 1
num = int(input('Ingrese su primer numero: '))
while num != numAleatorio:
    if(num < numAleatorio):
        num = int(input('¡Casi! El numero que buscas es mas grande, intentalo de nuevo: '))
    else:
        num = int(input('¡Casi! El numero que buscas es mas chico, intentalo de nuevo: '))
    intentos += 1

print('¡FELICIDADES! Has ganado')
print(f'El numero era ', numAleatorio, ' y solo te costo ', intentos, ' intentos')
