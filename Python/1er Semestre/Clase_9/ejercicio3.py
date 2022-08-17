#Leer 10 numero e imprimir cuantos son positivos, cuantos negativos y cuantos neutros

negativos = 0
positivos = 0
neutros = 0

for i in range(10):
    num = int(input('Digite un numero: '))
    if num > 0:
        positivos += 1
    elif num < 0:
        negativos += 1
    else:
        neutros += 1

print(f'Hay {positivos} numeros positivos ingresados')
print(f'Hay {negativos} numeros negativos ingresados')
print(f'Hay {neutros} numeros neutros ingresados')