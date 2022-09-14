#Menu interactivo cajero automatico, hacer un programa que simule un cajero automatico con un saldo inicial de 1000$ y las siguientes opciones: Ingresar dinero, retirar dinero y mostrar dinero y salir

TOTAL_SALDO = 1000
salir = False
clave = 1234

def ingresarDinero():
    ingreso = int(input('¿Cuanto dinero desea ingresar? '))
    return ingreso
    

def retirarDinero():
    retiro = int(input(f'¿Cuanto dinero desea retirar?'))
    return retiro
    

def mostrarDinero():
    print(f'Su dinero actual es de: ', TOTAL_SALDO, ' pesos')

print('BIENVENIDO A SU BANCO PERSONAL')
claveIngresada = int(input('Por favor, ingrese su clave: '))

while clave != claveIngresada:
    claveIngresada = int(input('La clave ingresada es incorrecta, por favor intente nuevamente: '))

while salir == False:
    print('1. Ingresar dinero en la cuenta')
    print('2. Retirar dinero en la cuenta')
    print('3. Mostrar dinero disponible')
    print('4. Salir')

    opcion = int(input('¿Que desea hacer? '))
    while opcion < 1 and opcion > 4:
        opcion = int(input('Opcion ingresada no valida, intentelo nuevamente: '))

    if(opcion == 1):
        TOTAL_SALDO = TOTAL_SALDO + ingresarDinero()
        print(f'Su saldo final es de: ', TOTAL_SALDO, '$')
    elif(opcion == 2):
        TOTAL_SALDO = TOTAL_SALDO - retirarDinero()
        print(f'Su saldo final es de: ', TOTAL_SALDO, '$')
    elif(opcion == 3):
        mostrarDinero()
    else:
        print('Vuelva pronto')
        salir = True

