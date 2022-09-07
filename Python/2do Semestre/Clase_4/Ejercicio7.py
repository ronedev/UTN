#Insertar elementos y ordenarlos: Pedir numeros y meterlos en una lsita, cuando el usaurio introduzca un numero 0, nuestro programa dejaria de insetar. Por ultimo, mostrar los numeros ordenados de menor a mayor
lista = []

salir = False

while not salir:
    num = int(input('Ingrese un numero: '))
    if(num == 0):
        salir = True
    else:
        lista.append(num)
lista.sort()
print(f'Lista ordenada: {lista}')
