#Programa que recibira una nota numerica del 0 al 10 y letra a modo de nota siendo A[10, 9], B(9, 8], C(8, 7], D(7, 6], F(6, 0]

calificacion = 0

while True:
    calificacion = float(input('Ingrese la nota: '))
    if(calificacion >= 0 and calificacion <= 10):
        break
    else:
        print('**Ingrese una nota válida**')

if(calificacion <= 10 and calificacion >=9):
    print('A')
elif(calificacion < 9 and calificacion >=8):
    print('B')
elif(calificacion < 8 and calificacion >= 7):
    print('C')
elif(calificacion < 7 and calificacion >= 6):
    print('D')
else:
    print('F')