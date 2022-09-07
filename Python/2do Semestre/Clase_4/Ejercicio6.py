#Modificar los elementos de una lista: Llenar una lista con los numeros del 1 al 10, luego modificar los elementos de la lista muiltiplicandolos por un valor ingresado por el usuario

lista = list(range(1,11))

num = int(input('Ingrese un numero: '))

for i in lista:
    lista[i-1] = (num * lista[i-1])

for i in range(1, 11):
    print(f'{num} x {i} = {lista[(i-1)]}')