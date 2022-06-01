#Programa que recibira una nota numerica del 0 al 10 y letra a modo de nota siendo A[10, 9], B(9, 8], C(8, 7], D(7, 6], F(6, 0]

nota = 0

while True:
    nota = float(input('Ingrese la nota: '))
    if(nota >= 0 and nota <= 10):
        break
    else:
        print('**Ingrese una nota válida**')

if(nota <= 10 and nota >=9):
    print('A')
elif(nota < 9 and nota >=8):
    print('B')
elif(nota < 8 and nota >= 7):
    print('C')
elif(nota < 7 and nota >= 6):
    print('D')
else:
    print('F')