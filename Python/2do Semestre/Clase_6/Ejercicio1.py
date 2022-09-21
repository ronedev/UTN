#Hacer un programa que pida una cadena y luego meta los caracteres en una lista sin repetirlos

cadena = input('Ingrese su cadena: ')
lista = []

for caracter in cadena:
    if(caracter not in lista):
        lista.append(caracter)

print(lista)