#Programa que reciba la edad del usuario e imprima la etapa de su vida en la que se encuentra

edad = 0

while True:
    edad = int(input('Ingrese su edad: '))
    if(edad > 0 and edad < 100):
        break
    else:
        print('**Ingrese una edad válida**')

if(edad >= 0 and edad <= 9):
    print('La infancia es increible y bella')
elif(edad >= 10 and edad <= 19):
    print('Tienes muchos cambios, mucho que estudiar')
elif(edad >= 20 and edad <= 29):
    print('Amor y comienza el trabajo')
elif(edad >= 30 and edad <= 39):
    print('Hijos, desamor y añorando la jubilación')
elif(edad >= 40 and edad <= 49):
    print('Deudas y frustración')
elif(edad >= 50 and edad <= 59):
    print('Alcoholemia y divorcio')
elif(edad >= 60 and edad <= 69):
    print('Nietos y jubilación')
elif(edad >= 70 and edad <= 79):
    print('Dinero y tiempo de sobra, pero el cuerpo ya no es lo mismo')
elif(edad >= 80 and edad <= 89):
    print('Pie en el cajón')
elif(edad >= 90 and edad <= 99):
    print('Mirta Legrand')