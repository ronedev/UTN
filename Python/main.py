# miVariable = 3
# print(miVariable)
# miVariable = "Holaaaa!"
# print(miVariable)
# miVariable = 3.5
# print(miVariable)

# x = 10
# y = 2
# z = x + y

# print(id(x))
# print(id(y))
# print(id(z))
#Las literales se escriben x864, la variable y = x736, la variable z = x896

# Manejo de cadenas (Strings)
# miGrupoFav = "Metallica"
# print("Mi grupo favorito es: " + miGrupoFav)

# num1 = "7"
# num2 = "8"
# int() transforma el string en numero
# print(int(num1) + int(num2))

#Tipos Booleanos (bool)
# miBooleano = 1 > 2
# print(miBooleano)

# if miBooleano:
#     print("Verdaderooooo")
# else:
#     print("falsooo")

# Procesar la entrada del usuario con la funcion input
# resultado = input("Ingrese un valor para resultado: ") #Por defecto devuelve un dato de tipo string

# print(resultado)

# Conversion de la entrada
# num1 = int(input("Digite un numero: "))
# num2 = int(input("Digite el segundo numero: "))
# resultado = num1 + num2

# print(resultado)

# operandoA = 8
# operandoB = 5
# suma = operandoA + operandoB
# # print("El resultado de la suma es: ",suma)
# print(f"El resultado de la suma es: {suma}")

# resta = operandoA - operandoB
# print(f"El resultado de la resta es: {resta}")

# multiplicacion = operandoA * operandoB
# print(f"El resultado de la multiplicacion es: {multiplicacion}")

# division = operandoA / operandoB
# print(f"El resultado de la division es: {division}")

# divisionNumeroEntero = operandoA // operandoB
# print(f"El resultado de la division con solo el lado entero es: {divisionNumeroEntero}")

# modulo = operandoA % operandoB
# print(f"El resultado del modulo es: {modulo}")

# exponente = operandoA ** operandoB
# print(f"El resultado del exponente es: {exponente}")

# miVariable = 10
# print(miVariable)

# #Operadores de reasignacion
# miVariable = miVariable + 1
# print(miVariable)

# miVariable += 1
# print(miVariable)

# #miVariable = miVariable -2
# miVariable -= 2
# print(miVariable)

# #miVariable = miVariable * 3
# miVariable *= 3
# print(miVariable)

# #miVariable = miVariable / 2
# miVariable /= 2
# print(miVariable)

#Operadores de comparacion
# d = 4
# b = 2
# resultado = d == b #Comprobamos si son iguales
# print(resultado)

# resultado = d != b #Comprobamos si diferentes
# print(resultado)

# resultado = d > b #Comprobamos si d es mayor que b
# print(resultado)

# resultado = d < b #Comprobamos si d es menor que b
# print(resultado)

# resultado = d <= b #Comprobamos si d es menor o igual que b
# print(resultado)

# resultado = d >= b #Comprobamos si d es mayor o igual que b
# print(resultado)

#Ejercico valor dentro de un rango

# valor = int(input('Ingrese un numero: '))
# valorMinimo = 0
# valorMaximos = 5
# dentroRango = (valor >= valorMinimo and valor <= valorMaximos)

# if dentroRango:
#     print(f'El numero {valor} esta dentro del rango')
# else:
#     print(f'El numero {valor} esta fuera del rango')

#Operador or y operador not
# vacaciones = True
# diaDescanso = False
# if not(vacaciones or diaDescanso):
#     print('Tiene trabajo que hacer')
# else:
#     print('Puede asistir al juego')

#Rango entre las edades 20 y 30 años

# edad = int(input('Ingrese la edad: '))

# veinte = edad >= 20 and edad < 30
# print(veinte)

# treinta = edad >= 30 and edad < 40
# print(treinta)

# if veinte:
#     print('Entre 20 y 30 años')
# elif treinta:
#     print('Entre 30 y 40 años')
# else:
#     print('Fuera de rango')

#El mayor de dos numeros

# num1 = int(input('Digite el numero uno: '))
# num2 = int(input('Digite el numero dos: '))

# if num1 > num2:
#     print('El numero 1 es mayor')
# else:
#     print('El numero 2 es mayor')

#Tienda de libros

# book_name = input('Ingrese el nombre del libro: ')
# book_id = int(input('Ingrese el id del libro: '))
# book_price = int(input('Ingrese el precio del libro: '))
# book_sending = input('Envio gratis(True/False): ')

# if book_sending == 'True':
#     book_sending = True
# elif book_sending == 'False':
#     book_sending = False
# else:
#     book_sending = "El valor es incorrecto, debe ingresar True o False"

# print(f'''
#         Nombre: {book_name}
#         ID: {book_id}
#         Precio: {book_price}
#         Envio gratuito: {book_sending}
# ''')

#sentencia if else
# condicion = False
# if condicion == True:
#     print('Verdadero')
# elif condicion == False:
#     print('Falso')
# else:
#     print('Condicion sin especificar')

#Operador ternario
condicion = False
print('Condicion verdader') if condicion else print('Condicion falsa')

    
#Conversion de numero a texto

# num = int(input('Digite un numero entre el 1 y el 3: '))
# numTexto = ''

# if num == 1:
#     numTexto = 'Número uno'
# elif num == 2:
#     numTexto = 'Número dos'
# elif num == 3:
#     numTexto = 'Número tres'
# else:
#     numTexto = 'Has ingresado un número fuera del rango'

# print(f'El numero ingresado es el: {numTexto}')

# miVariable = int(input('Ingrese un numero'))

# print("Su numero multiplicado por 5 es: ", miVariable * 5)

#Ejercicio Nº1: Calcule el area y perimetro en base al ancho y alto de un rectangulo

# alto : int = int(input('Ingrese el alto del rectangulo: '))
# ancho : int = int(input('Ingrese el ancho del rectangulo: '))

# area = alto * ancho

# perimetro = (alto + ancho) * 2

# print(f'El resultado del perimetro del rectangulo (base: {ancho}, alto: {alto}) es: {perimetro}')
# print(f'El resultado del area del rectangulo (base: {ancho}, alto: {alto}) es: {area}')

#Comentario una linea
'''
Comentario
Multi
Linea
'''
#Ejercicio Nº2: Par o impar

# num : int = int(input('Ingrese un numero a evaluar si es par o no: '))

# if num % 2 == 0:
#     print(f'El numero {num} es par.')
# else:
#     print(f'El numero {num} es impar.')

