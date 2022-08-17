#Dada la siguiente tupla 
tupla = (13, 1, 8, 3, 2, 5, 8)

#Crear una lista que solo incluya los numeros menores a 5 e imprima por consola [1,3,2]
list1 = []

for num in tupla:
    if(num < 5):
        list1.append(num)

print(list1)