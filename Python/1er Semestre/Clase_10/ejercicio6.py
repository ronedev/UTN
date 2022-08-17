#Ingresar "n" enteros, visualizar la suma de los pares, cuantos existen y el promedio de los numero impares
i = 1
sumaPares = 0
sumaImpares = 0
totalPares = 0
totalImpares = 0

totalNum = int(input('Digite la cantidad de elementos a ingresar: '))

while i <= totalNum:
    num = int(input(f'{i}.Digite un número: '))

    if num % 2 == 0:
        #ES PAR
        sumaPares += num
        totalPares += 1
    else:
        #ES IMPAR
        sumaImpares += num
        totalImpares += 1

    i += 1

if totalPares == 0:
    print('No se han digitado números pares')
else:
    print(f'La suma de los numeros pares es: {sumaPares}')
    print(f'En total hay {totalPares} números pares')

if totalImpares == 0:
    print('No se han digitado números impares')
else:
    print(f'El promedio de números impares es: {sumaImpares / totalImpares}')