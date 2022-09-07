#Eliminar duplicados de una lista: Escriba un programa donde tenga una lista y que a continuacion elimine los elementos repetidos, por ultimo mostrar la lista

#Creamos una lista
lista = [1,2,3,4,4,4,5,6,7,1,3,4]

listaSinRepetidos = set(lista)

print(list(listaSinRepetidos))