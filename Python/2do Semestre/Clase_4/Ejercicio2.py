#Operaciones de conjuntos con listas: Escriba un programa que tenga 2 listas yt que a continuacion cree las siguientes listas (En las que no debe haber repeticion)
#1 Lista de palabras que aporecen en las listas
#2 Lista de palabras que aparecen en la primera lista pero no en la segunda
#3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
#4 Lista de palabras que aparecen en ambas listas

lista1 = ['España', 'Inglaterra', 'Francia', 'Rusia', 'Estados Unidos','Argentina']
lista2 = ['Argentina', 'Peru', 'China', 'Chile', 'Mexico','Francia', 'Rusia']

listaConjunta = list(set(lista1 + lista2))
print(listaConjunta)

listaPalabras1 = []

for pais in listaConjunta:
    if(pais in lista1):
        listaPalabras1.append(pais)

print(listaPalabras1)

listaPalabras2 = []

for pais in listaConjunta:
    if(pais in lista2):
        listaPalabras2.append(pais)

print(listaPalabras2)

listaInterseccion = []

for pais in listaConjunta:
    if((pais in lista1) and (pais in lista2)):
        listaInterseccion.append(pais)

print(listaInterseccion)