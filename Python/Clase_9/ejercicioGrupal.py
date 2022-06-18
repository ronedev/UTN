#Calcular la suma de N primeros numeros
totalNum = int(input('Digite la cantidad de numeros a sumarse: '))
suma = 0
for num in range(totalNum + 1): #Se le suma 1 porque el primero es 0
    print(num)
    suma += num
print(f'La suma es: {suma}')